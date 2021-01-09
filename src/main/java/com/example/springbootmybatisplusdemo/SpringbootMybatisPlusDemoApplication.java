package com.example.springbootmybatisplusdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xusy
 */
@SpringBootApplication
@MapperScan("com.example.springbootmybatisplusdemo.mapper")
public class SpringbootMybatisPlusDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisPlusDemoApplication.class, args);
	}

}
