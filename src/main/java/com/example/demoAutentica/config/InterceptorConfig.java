package com.example.demoAutentica.config;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.Objects;

@Configuration
public class InterceptorConfig implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String authorization = httpRequest.getHeader("Authorization");
        System.out.println(authorization);
        if (Objects.nonNull(authorization) && "123".equals(authorization)) {
            chain.doFilter(request, response);
            return;
        }
        throw new RuntimeException("Não foi possível realizar a autenticação");
    }
}
