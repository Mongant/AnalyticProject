package com.mongant.analytics.dao;

import com.mongant.analytics.entity.DeveloperSalary;
import com.mongant.analytics.entity.DeveloperSalary;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SqlResult {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public List<DeveloperSalary> getResult(List<String> parameters, String genderParam) {
        String position;
        String programmingLanguage;
        String specialization;
        String totalWorkExperience;
        String currentPlaceExperience;
        int salaryMonth;
        int changeSalaryIn_12_Month;
        String city;
        String companySize;
        String companyType;
        char gender;
        int age;
        String education;
        String university;
        boolean student;
        String englishLevel;
        String subjectArea;
        String date;
        String userAgent;

        StringBuilder sb = new StringBuilder();
        List<DeveloperSalary> employeeSalaryEntities = new ArrayList<>();
        sb.append("select * from PROGRAMMING_EMPL_INFO.JUNE_2018");
        if(parameters != null && !parameters.isEmpty()) {
            sb.append(" where POSITION in ('");
            for(int i = 0; i < parameters.size(); i++ ) {
                if(i == 0) {
                    sb.append(parameters.get(i) + "'");
                } else {
                    sb.append(", '" + parameters.get(i) + "'");
                }
            }
            sb.append(")");
        }
        if(genderParam != null) {
            sb.append("\nand GENDER = '" + genderParam + "'");
        }
        sb.append(";");
        String sql = sb.toString();
        try {
            connection = new H2DBConnection().getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                position = resultSet.getString("POSITION");
                programmingLanguage = resultSet.getString("PROGRAMMING_LANGUAGE");
                specialization = resultSet.getString("SPECIALIZATION");
                totalWorkExperience = resultSet.getString("TOTAL_WORK_EXPERIENCE");
                currentPlaceExperience = resultSet.getString("CURRENT_PLACE_EXPERIENCE");
                salaryMonth = resultSet.getInt("SALARY_MONTH");
                changeSalaryIn_12_Month = resultSet.getInt("CHANGE_SALARY_IN_12_MONTHS");
                city = resultSet.getString("CITY");
                companySize = resultSet.getString("COMPANY_SIZE");
                companyType = resultSet.getString("COMPANY_TYPE");
                gender = (resultSet.getString("GENDER")).charAt(0);
                age = resultSet.getInt("AGE");
                education = resultSet.getString("EDUCATION");
                university = resultSet.getString("UNIVERSITY");
                student = resultSet.getBoolean("STUDENT");
                englishLevel = resultSet.getString("ENGLISH_LEVEL");
                subjectArea = resultSet.getString("SUBJECT_AREA");
                date = resultSet.getString("DATE");
                userAgent = resultSet.getString("USER_AGENT");
                employeeSalaryEntities.add(new DeveloperSalary(position, programmingLanguage, specialization, totalWorkExperience, currentPlaceExperience, salaryMonth, changeSalaryIn_12_Month, city, companySize, companyType, gender, age, education, university, student, englishLevel, subjectArea, date, userAgent));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
        return employeeSalaryEntities;
    }

    public List<DeveloperSalary> getPositionSet() {
        String position;

        List<DeveloperSalary> positions = new ArrayList<>();
        String sql = "select distinct POSITION\n" +
                     "  from PROGRAMMING_EMPL_INFO.JUNE_2018\n" +
                     " order by POSITION";
        try {
            connection = new H2DBConnection().getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                position = resultSet.getString("POSITION");
                positions.add(new DeveloperSalary(position));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return positions;
    }
}
