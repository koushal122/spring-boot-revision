package com.koushal.springbootproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getCourses(){
        return Arrays.asList(
                new Course(1,"Java Full Stack","Koushal Jha"),
                new Course(2,"Learn Devops","Koushal Jha"),
                new Course(3,"Learn AWS","Koushal Jha"),
                new Course(3,"Learn AWS","Koushal Jha")
        );
    }
}
