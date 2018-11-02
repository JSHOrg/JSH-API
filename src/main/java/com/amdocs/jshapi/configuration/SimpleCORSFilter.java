package com.amdocs.jshapi.configuration;

import java.io.IOException;
import org.springframework.core.Ordered;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class SimpleCORSFilter implements Filter {

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
            FilterChain chain) throws IOException, ServletException {
    	
    	HttpServletRequest request = (HttpServletRequest) req;
    	
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods",
                "DELETE, GET, OPTIONS, PATCH, POST, PUT");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers",
                "Content-Type, Accept, X-Requested-With, remember-me, Authorization, x-auth-token");

        System.out.println("cors filter called");
        if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
         response.setStatus(HttpServletResponse.SC_OK);
        }else {
            chain.doFilter(req, res);
       }
        /* Revisar si necesita regresar un 200 o 204 */
        /*
        if ("DELETE".equalsIgnoreCase(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
           }else {
               chain.doFilter(req, res);
          } */
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

}