package com.qf.springbootmybatis.controller;

import com.qf.springbootmybatis.entity.TUser;
import com.qf.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XuCong
 * @Date 2019/7/30
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("get/{id}")
    @ResponseBody
    public TUser GetUser(@PathVariable("id") Integer id){
       return iUserService.getById(id);

    }

    @RequestMapping("hello")
    public String hello(ModelMap map){
        int a=1/0;
        map.put("username","马云");
        map.put("age",40);
        List<TUser> list=new ArrayList<>();
        list.add(new TUser(1,"a","123"));
        list.add(new TUser(2,"b","123"));
        list.add(new TUser(3,"c","123"));
        map.put("list",list);
        return "Hello";
    }
}
