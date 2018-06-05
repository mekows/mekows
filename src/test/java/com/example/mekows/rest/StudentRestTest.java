package com.example.mekows.rest;

import com.example.mekows.entity.Student;
import com.example.mekows.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRestTest {
    @Autowired
    private StudentRest studentRest;
//    @Test
//    public void saveStudent() {
//        try {
//            studentRest.saveStudent();
//            System.out.print("插入成功");
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//            System.out.print("插入失败");
//        }
//    }
//    @Test
//    public  void findStudentById (){
//        Integer id=123;
//        studentRest.findStudent(id);
////        Student student = studentService.findStudentById(id);
////        return "name:" + student.getName() + " age:" + student.getAge();
//
//    }
}