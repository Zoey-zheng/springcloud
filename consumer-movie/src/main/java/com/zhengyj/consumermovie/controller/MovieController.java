package com.zhengyj.consumermovie.controller;

import com.zhengyj.consumermovie.entity.User;
import com.zhengyj.consumermovie.service.UserFeign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.Service;

/**
 *
 * @Author zhengyingjun
 * @Description ：
 * @Date 11:03 2019-06-12
 **/

@RestController
public class MovieController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);


   // @Autowired
   // private RestTemplate restTemplate;
   @Autowired
   private UserFeign userFeign;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/user/{id}")
    public User getOneById(@PathVariable Long id){
       // return restTemplate.getForObject("http://producer-user/"+id,User.class);
        return userFeign.getOne(id);
    }

    /**
     * 打印使用情况
     */
    @GetMapping("/Log")
    public void logs(){
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("producer-user");
        MovieController.LOGGER.info("{}:{}:{}",serviceInstance.getServiceId(),serviceInstance.getHost(),serviceInstance.getPort());
    }

}
