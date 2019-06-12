package com.zhengyj.produceruser.controller;

import com.zhengyj.produceruser.entity.User;
import com.zhengyj.produceruser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @Author zhengyingjun
 * @Description ：
 * @Date 10:43 2019-06-12
 **/
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/{id}")
    public User getOneById(@PathVariable Long id){

        return userRepository.getOne(id);
    }


}
