package com.example.mekows.rest;

import com.example.mekows.entity.Teacher;
import com.example.mekows.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mekows on 17/06/02.
 */

@RestController
@RequestMapping("/teacher")
public class TeacherRest {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/saveTeacher")
    public String saveTeacher() {
        String result = "";
        Teacher teacher = new Teacher("mekows", 25);
        try {
            teacherService.saveTeacher(teacher);
            result = "插入成功";
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            result = "插入失败";
        }
        return result;
    }
}
