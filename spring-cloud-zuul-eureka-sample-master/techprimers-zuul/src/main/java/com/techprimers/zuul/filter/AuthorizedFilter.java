package com.techprimers.zuul.filter;

import com.netflix.util.Pair;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import freemarker.template.utility.StringUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.Charset;
import java.util.Base64;

public class AuthorizedFilter extends ZuulFilter {

    @Override
    public Object run() throws ZuulException {

        org.springframework.security.core.Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            RequestContext requestContext = RequestContext.getCurrentContext();
            requestContext.addZuulRequestHeader("X-AUTH-ID", authentication.getPrincipal().toString());
            return null;
        }
        //window.btoa("admin:admin");  Javascript
        RequestContext curContext = RequestContext.getCurrentContext();
        HttpServletRequest httpRequest = curContext.getRequest();
        String auth = httpRequest.getHeader("Authorization");
        if (!StringUtils.isEmpty(auth)) {
            curContext.addZuulRequestHeader("Authorization", auth);
            return null;
        }
        String username = httpRequest.getHeader("username");
        String password = httpRequest.getHeader("password");
        if (!StringUtils.isEmpty(username) && !StringUtils.isEmpty(password)) {
            byte[] encodedAuth = Base64.getEncoder().encode(String.format("%s:%s",username,password).getBytes(Charset.forName("US-ASCII")));
            String authHeader = "Basic " + new String(encodedAuth);
            curContext.addZuulRequestHeader("Authorization", authHeader);
            return null;
        }
        return null;
    }

    @Override
    public boolean shouldFilter() { // 该filter是否要执行

        return true;
    }

    @Override
    public int filterOrder() {
        return 0; // 设置优先级，数值越大优先级越高
    }

    @Override
    public String filterType() {
        // 在进行Zuul过滤的时候可以设置其他过滤执行的位置，那么此时有如下几种类型
        // pre:请求前设置
        // route 请求的时候
        // post :发送的
        // error: 出错之后
        return "pre";
    }


}
