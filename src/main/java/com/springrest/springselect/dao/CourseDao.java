package com.springrest.springselect.dao;

import com.springrest.springselect.entities.Course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long>{
    
}