package com.course.course;

import com.course.course.components.PostComponent;
import com.course.course.models.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApplication implements CommandLineRunner {
    @Autowired
    @Qualifier("beanConnection")
    private Connection conn;

    @Autowired
    @Qualifier("com.course.course.components.PostComponent")
    private PostComponent postComponent;

    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        postComponent.getPosts().forEach(p -> {
            System.out.println(p.getDescription());
        });
    }
}
