package com.springrest.springselect.services;

import java.util.ArrayList;
import java.util.List;

import com.springrest.springselect.entities.Course;

import org.springframework.stereotype.Service;
@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;
    public CourseServiceImpl(){
        list=new ArrayList<>();
        list.add(new Course(101,"React.js","Important course"));
        list.add(new Course(102,"SpringBoot","course to learn how REST APIs work"));
    
    }
   
    @Override
    public List<Course> getCourses() {
        return list;
    }
    @Override
    public Course getCourse(long courseId)
    {
        for(Course course:list)
        {
            if(course.getId()==courseId)
                return course;
        }
        return null;   
    }
    @Override
    public Course addCourse(Course course)
    {
        list.add(course);
        return null;
    }
    
}