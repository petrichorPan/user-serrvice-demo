package com.leyou.userserrvice.service;

import com.leyou.userserrvice.mapper.UserMapper;
import com.leyou.userserrvice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author PanJR
 * @create 2019-04-19 14:22
 */
@Service
public class UserSerrvice {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id){
        return this.userMapper.selectByPrimaryKey(id);
    }
}
