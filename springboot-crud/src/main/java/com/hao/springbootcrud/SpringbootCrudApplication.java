package com.hao.springbootcrud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.hao.springbootcrud.dao")
@SpringBootApplication
public class SpringbootCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudApplication.class, args);
	}

}
