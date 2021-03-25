package com.springrest.springselect.services;

import java.util.ArrayList;
import java.util.List;


import com.springrest.springselect.dao.CourseDao;
import com.springrest.springselect.entities.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CourseServiceImpl implements CourseService {
   
    @Autowired
    private CourseDao courseDao;
       
    public CourseServiceImpl()
    {
        
    }
       
    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }
    @Override
    public Course getCourse(long courseId)
    {
       return courseDao.getOne(courseId); 
    }
    @Override
    public Course addCourse(Course course)
    {
        courseDao.save(course);
        return course;
    }
    @Override
    public Course updateCourse(Course course)
    {
        courseDao.save(course);//this updates also
        return course;
    }
    @Override
    public void deleteCourse(long courseId)
    {
        Course c=courseDao.getOne(courseId);
        courseDao.delete(c);
    }
    
}