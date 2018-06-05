package com.example.mekows.dao.impl;

import com.example.mekows.dao.TeacherDao;
import com.example.mekows.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TeacherImpl implements TeacherDao {
    @Autowired
    private TeacherDao teacherDao;
    @Override
    @Transactional(rollbackFor=Exception.class,propagation = Propagation.REQUIRED)
    public void saveTeacher(Teacher teacher) throws Exception {
        teacherDao.saveTeacher(teacher);
    }
}
