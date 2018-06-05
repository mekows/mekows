package com.example.mekows.service;

import com.example.mekows.dao.StudentDao;
import com.example.mekows.dao.TeacherDao;
import com.example.mekows.entity.Student;
import com.example.mekows.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by luyh on 16/4/27.
 */

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private TeacherDao teacherDao;

    public void saveStudent(Student student) throws Exception {
        studentDao.saveStudent(student);
        Teacher teacher = new Teacher("mekows",25);
        teacherDao.saveTeacher(teacher);
    }

    public List<Student> findStudentById(String name) {
        return studentDao.findStudentById(name);
    }
}
