package com.cbr.university.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TeacherMapper implements RowMapper<Teacher> {

    public Teacher mapRow(ResultSet resultSet, int i) throws SQLException {
        Teacher teacher = new Teacher();
        teacher.setId(resultSet.getInt("teacher_id"));
        teacher.setFirstName(resultSet.getString("teacher_first_name"));
        teacher.setLastName(resultSet.getString("teacher_last_name"));
        teacher.setCourseId(resultSet.getInt("course_id"));
        return teacher;
    }
}
