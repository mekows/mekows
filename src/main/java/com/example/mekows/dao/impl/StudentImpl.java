package com.example.mekows.dao.impl;

import com.example.mekows.dao.StudentDao;
import com.example.mekows.entity.Student;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Query;
import java.beans.Statement;
import java.sql.Connection;
import java.util.List;

@Component
public class StudentImpl implements StudentDao {
    @Autowired
    private StudentDao studentDao;

    @Override
    public void saveStudent(Student student) throws Exception {
        studentDao.saveStudent(student);

    }

    @Override
    public List<Student> findStudentById(String name){

        return  studentDao.findStudentById(name);
    };
}
