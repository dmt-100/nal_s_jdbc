package com.example.config;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public interface IMySpringMvcDispatcherSerlvetIntitializer extends WebApplicationInitializer {
    void onStartup(ServletContext aServletContext) throws ServletException, jakarta.servlet.ServletException;
}
