package com.mongant.analytics.dao;

import com.mongant.analytics.entity.DeveloperSalary;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DeveloperSalaryMapper implements RowMapper<DeveloperSalary> {

    @Override
    public DeveloperSalary mapRow(ResultSet resultSet, int i) throws SQLException {
        DeveloperSalary developerSalary = new DeveloperSalary();
        developerSalary.setPosition(resultSet.getString("POSITION"));
        developerSalary.setProgrammingLanguage(resultSet.getString("PROGRAMMING_LANGUAGE"));
        developerSalary.setSpecialization(resultSet.getString("SPECIALIZATION"));
        developerSalary.setTotalWorkExperience(resultSet.getString("TOTAL_WORK_EXPERIENCE"));
        developerSalary.setCurrentPlaceExperience(resultSet.getString("CURRENT_PLACE_EXPERIENCE"));
        developerSalary.setSalaryMonth(resultSet.getInt("SALARY_MONTH"));
        developerSalary.setChangeSalaryIn_12_Month(resultSet.getInt("CHANGE_SALARY_IN_12_MONTHS"));
        developerSalary.setCity(resultSet.getString("CITY"));
        developerSalary.setCompanySize(resultSet.getString("COMPANY_SIZE"));
        developerSalary.setCompanyType(resultSet.getString("COMPANY_TYPE"));
        developerSalary.setGender(resultSet.getString("GENDER").charAt(0));
        developerSalary.setAge(resultSet.getInt("AGE"));
        developerSalary.setEducation(resultSet.getString("EDUCATION"));
        developerSalary.setUniversity(resultSet.getString("UNIVERSITY"));
        developerSalary.setStudent(resultSet.getBoolean("STUDENT"));
        developerSalary.setEnglishLevel(resultSet.getString("ENGLISH_LEVEL"));
        developerSalary.setSubjectArea(resultSet.getString("SUBJECT_AREA"));
        developerSalary.setDate(resultSet.getString("DATE"));
        developerSalary.setUserAgent(resultSet.getString("USER_AGENT"));
        return developerSalary;
    }
}
