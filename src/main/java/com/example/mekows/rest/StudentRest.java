package com.example.mekows.rest;
import com.example.mekows.entity.Student;
import com.example.mekows.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mekows on 17/06/02.
 */

@RestController
@RequestMapping("/student")
public class StudentRest {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/saveStudent")
    public String saveStudent() {
        String result = "";
        Student student = new Student("bb", 23);
        try {
            studentService.saveStudent(student);
            result = "插入成功";
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            result = "插入失败";
        }
        return result;

    }

    @RequestMapping("/findStudent/{name}")
    public String findStudent(String name) {
        List<Student> list = studentService.findStudentById(name);
        return list.toString();
    }
}
