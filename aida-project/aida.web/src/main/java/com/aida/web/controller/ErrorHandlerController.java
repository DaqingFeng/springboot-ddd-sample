package com.aida.web.controller;

import com.aida.web.code.ErrorJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by fengdaqing on 2018/5/15.
 */
@Controller
public class ErrorHandlerController implements ErrorController {

    @Value("${custom-error-controller.debug}")
    private boolean debug;

    @Autowired
    private ErrorAttributes errorAttributes;

    private static final String path = "/error";

    @Override
    public String getErrorPath() {
        return path;
    }

    @RequestMapping(value = path)
    public String error(HttpServletRequest request) {
        Integer httpErrorCode = getErrorCode(request);
        String errorUrl;
        switch (httpErrorCode) {
            case 400: {
                errorUrl = "Error/403";
                break;
            }
            case 401: {
                errorUrl = "Error/401";
                break;
            }
            case 404: {
                errorUrl = "Error/404";
                break;
            }
            case 500: {
                errorUrl = "Error/500";
                break;
            }
            default:
                errorUrl = "Error/404";
        }
        return errorUrl;
    }

//    @RequestMapping(value = path)
//    public ErrorJson error(HttpServletRequest request, HttpServletResponse response) {
//        // Appropriate HTTP response code (e.g. 404 or 500) is automatically set by Spring.
//        // Here we just define response body.
//        return new ErrorJson(response.getStatus(), getErrorAttributes(request, debug));
//    }

    private int getErrorCode(HttpServletRequest httpRequest) {
        return (Integer) httpRequest
                .getAttribute("javax.servlet.error.status_code");
    }

    private Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
        RequestAttributes requestAttributes = new ServletRequestAttributes(request);
        return errorAttributes.getErrorAttributes(requestAttributes, includeStackTrace);
    }
}

