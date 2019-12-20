package com.cy.springbootshiromybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//mybaits扫描包
@MapperScan("com.cy.springbootshiromybatis.business.dao")
public class SpringbootShiroMybatisApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootShiroMybatisApplication.class, args);
  }

}
