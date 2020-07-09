package com.community.auth.handler;

import com.community.auth.constant.SecurityConstant;
import com.community.auth.util.ResponseUtil;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Chavy, Walter
 * @date 2020/4/13
 */
@Component
public class CustomHttp401AuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        ResponseUtil.printCode(httpServletResponse, SecurityConstant.ACCESS_DENY, 401);
    }
}
