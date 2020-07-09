package com.community.auth.util;

import com.community.auth.constant.SecurityResult;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Chavy, Walter
 */
public class ResponseUtil {

    public static <T> void printCode(HttpServletResponse response, SecurityResult<T> result, Integer statusCode) throws IOException {
        response.setContentType("application/json; charset=utf-8");
        response.setStatus(statusCode);
        PrintWriter writer = response.getWriter();
//        ObjectRepository objectRepository = new ObjectRepository();
//        String json = objectRepository.writeValueAsString(result);
        String json = "";
        writer.print(json);
        writer.close();
        response.flushBuffer();
    }
}
