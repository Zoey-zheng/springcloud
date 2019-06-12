package com.zhengyj.produceruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 *
 * @Author zhengyingjun
 * @Description ：client启动类
 * @Date 10:30 2019-06-12
 **/
@EnableEurekaClient
@SpringBootApplication
public class ProducerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerUserApplication.class, args);
    }

}
