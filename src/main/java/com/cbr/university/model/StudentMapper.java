package com.cbr.university.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {

    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getInt("student_id"));
        student.setFirstName(resultSet.getString("student_first_name"));
        student.setLastName(resultSet.getString("student_last_name"));
        student.setGroupId(resultSet.getInt("group_id"));
        return student;
    }
}
