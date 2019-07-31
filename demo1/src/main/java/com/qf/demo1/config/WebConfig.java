package com.qf.demo1.config;

import com.qf.demo1.filter.MyFilter;
import com.qf.demo1.listener.MyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.EventListener;


/**
 * @author XuCong
 * @Date 2019/7/29
 */
@Configuration
public class WebConfig {
    @Autowired
    private MyFilter myFilter;
    @Autowired
    private MyListener myListener;
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(myFilter);
        filterRegistrationBean.setName("myFilter");
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean servletRequestListener(){
        ServletListenerRegistrationBean<EventListener> eventListenerServletListenerRegistrationBean = new ServletListenerRegistrationBean<>();
        eventListenerServletListenerRegistrationBean.setListener(myListener);
        return  eventListenerServletListenerRegistrationBean;
    }
}
