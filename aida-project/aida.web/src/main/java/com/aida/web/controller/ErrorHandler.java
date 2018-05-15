package com.aida.web.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by fengdaqing on 2018/5/15.
 */
@Controller
public class ErrorHandler implements ErrorController {
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

    private int getErrorCode(HttpServletRequest httpRequest) {
        return (Integer) httpRequest
                .getAttribute("javax.servlet.error.status_code");
    }
}

