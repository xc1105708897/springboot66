package com.qf.demo1.listener;


import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author XuCong
 * @Date 2019/7/29
 */
@Component
public class MyListener implements ServletRequestListener{
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("destroy...");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("initialized...");
    }
}
