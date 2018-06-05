package com.example.mekows.service;

import com.example.mekows.dao.TeacherDao;
import com.example.mekows.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luyh on 16/4/27.
 */

@Service
public class TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    public void saveTeacher(Teacher teacher) throws Exception {
        teacherDao.saveTeacher(teacher);
    }
}
