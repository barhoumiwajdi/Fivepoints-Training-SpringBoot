package com.example.jpatraining.Filter;


import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;
@Component
public class MyNewFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("this is a spécific filter ");
        filterChain.doFilter(servletRequest , servletResponse);
    }
}
