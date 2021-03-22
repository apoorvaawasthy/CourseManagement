package com.springrest.springselect.controller;


import java.util.List;

import com.springrest.springselect.entities.Course;
import com.springrest.springselect.services.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/Home")
    public String home(){
        return "Welcome to courses application!";
    }
    //get the courses
    @GetMapping("/courses")
    public List<Course> getCourses()
    {
            return this.courseService.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
        
    }
}