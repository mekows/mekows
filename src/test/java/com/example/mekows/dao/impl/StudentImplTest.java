package com.example.mekows.dao.impl;

import com.example.mekows.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentImplTest {
    @Autowired
    private StudentService studentService;
    @Test
    public void findStudentById() {
       String name = "mekows";
        studentService.findStudentById(name);
       System.out.print("查询结果"+studentService.findStudentById(name));
    }
}