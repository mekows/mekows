package com.example.mekows.dao;


import com.example.mekows.entity.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by mekows on 17/06/02.
 */

public interface StudentDao {
    /**
     * 插入数据
     * @param student
     * @throws Exception
     */
    void saveStudent(Student student) throws Exception;
    /**
     * 查询数据
     * @param name
     * @return
     */

    @Query(value = "select * from student where name=?", nativeQuery = true)
    @Modifying
    public List<Student> findStudentById(String name);

}
