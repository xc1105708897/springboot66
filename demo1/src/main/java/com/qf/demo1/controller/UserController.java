package com.qf.demo1.controller;

import com.qf.demo1.entity.Resource;
import com.qf.demo1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XuCong
 * @Date 2019/7/29
 */
//该注解表示所有方法都有@responsebody
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private Resource resource;

 /*   @Value("${images.serverpath}")
    private String imageServer;*/

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("date")
    public String date(User user){
        System.out.println(user.getUname());
        System.out.println(user.getPwd());
        System.out.println(resource.getEmailServer());
        return "1";
    }
}
