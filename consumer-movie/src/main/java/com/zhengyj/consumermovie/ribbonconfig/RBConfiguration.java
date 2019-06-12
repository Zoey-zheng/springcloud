package com.zhengyj.consumermovie.ribbonconfig;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @Author zhengyingjun
 * @Description ：使用ribbon时指定name的 自定义配置
 * @Date 12:03 2019-06-12
 **/
@Configuration
@RibbonClient(name = "producer-user",configuration = RibbonConfiguration.class)
public class RBConfiguration {

}
