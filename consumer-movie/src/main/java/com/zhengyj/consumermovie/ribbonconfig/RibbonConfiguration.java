package com.zhengyj.consumermovie.ribbonconfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @Author zhengyingjun
 * @Description ：ribbon自定义配置
 * @Date 11:29 2019-06-12
 **/
@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }

}
