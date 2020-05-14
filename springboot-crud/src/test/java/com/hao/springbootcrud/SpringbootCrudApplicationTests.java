package com.hao.springbootcrud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootCrudApplicationTests {


    @Autowired
    DataSourceProperties dataSourceProperties;

	@Test
	void contextLoads() {

        System.out.println(dataSourceProperties.getClass());

    }

}
