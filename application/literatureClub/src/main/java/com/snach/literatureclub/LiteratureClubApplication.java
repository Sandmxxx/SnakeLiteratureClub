package com.snach.literatureclub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.snach.literatureclub.dao")
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class LiteratureClubApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiteratureClubApplication.class, args);
    }

}
