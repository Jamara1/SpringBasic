package com.course.course.beans;

import com.course.course.models.Connection;
import com.course.course.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ConnectionBean {

    @Bean(name = "beanUser")
    public User getUser() {
        return new User();
    }

    @Bean(name = "beanConnection")
    public Connection getConnection() {
        Connection conn = new Connection();
        conn.setDb("mysql");
        conn.setUrl("localhost");

        return conn;
    }
}