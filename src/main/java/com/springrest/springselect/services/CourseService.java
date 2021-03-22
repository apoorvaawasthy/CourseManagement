package com.springrest.springselect.services;

import java.util.List;

import com.springrest.springselect.entities.Course;

public interface CourseService
{
    public List<Course> getCourses();
    public Course getCourse(long courseId);
    public Course addCourse(Course Course);
}