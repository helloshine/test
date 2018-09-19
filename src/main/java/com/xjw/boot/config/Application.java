package com.xjw.boot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@SpringBootConfiguration
@ComponentScan("com.xjw.boot")//不配置的话，只会在自己当前包和子包下扫描
@MapperScan("com.xjw.boot.dao")
public class Application {


}
