package com.zhengyj.consumermovie.service;

import com.zhengyj.consumermovie.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "producer-user")
public interface UserFeign {
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getOne(@PathVariable Long id);
}
