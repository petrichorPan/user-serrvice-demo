package com.leyou.userserrvice.controller;

import com.leyou.userserrvice.pojo.User;
import com.leyou.userserrvice.service.UserSerrvice;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author PanJR
 * @create 2019-04-19 14:12
 */
@RestController
@RequestMapping("user")
public class UserController {

    private final Logger logger=Logger.getLogger("UserController");
    @Autowired
    private UserSerrvice userSerrvice;


    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id){
        return this.userSerrvice.queryById(id);
    }

}
