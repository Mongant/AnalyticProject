package com.mongant.analytics.dao;

import com.mongant.analytics.util.StringUtils;

public class EmployeeSalaryEntity {

    private String position;
    private String programmingLanguage;
    private String specialization;
    private String totalWorkExperience;
    private String currentPlaceExperience;
    private int salaryMonth;
    private int changeSalaryIn_12_Month;
    private String city;
    private String companySize;
    private String companyType;
    private char gender;
    private int age;
    private String education;
    private String university;
    private boolean student;
    private String englishLevel;
    private String subjectArea;
    private String date;
    private String userAgrnt;

    public EmployeeSalaryEntity(String position, String programmingLanguage, String specialization, String totalWorkExperience, String currentPlaceExperience, int salaryMonth, int changeSalaryIn_12_Month, String city, String companySize, String companyType, char gender, int age, String education, String university, boolean student, String englishLevel, String subjectArea, String date, String userAgrnt) {
        this.position = position;
        this.programmingLanguage = programmingLanguage;
        this.specialization = specialization;
        this.totalWorkExperience = totalWorkExperience;
        this.currentPlaceExperience = currentPlaceExperience;
        this.salaryMonth = salaryMonth;
        this.changeSalaryIn_12_Month = changeSalaryIn_12_Month;
        this.city = city;
        this.companySize = companySize;
        this.companyType = companyType;
        this.gender = gender;
        this.age = age;
        this.education = education;
        this.university = university;
        this.student = student;
        this.englishLevel = englishLevel;
        this.subjectArea = subjectArea;
        this.date = date;
        this.userAgrnt = userAgrnt;
    }

    public EmployeeSalaryEntity(String position) {
        this.position = position;
    }

    public String getPosition() {
        return StringUtils.nullable(position);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getProgrammingLanguage() {
        return StringUtils.nullable(programmingLanguage);
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getSpecialization() {
        return StringUtils.nullable(specialization);
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getTotalWorkExperience() {
        return StringUtils.nullable(totalWorkExperience);
    }

    public void setTotalWorkExperience(String totalWorkExperience) {
        this.totalWorkExperience = totalWorkExperience;
    }

    public String getCurrentPlaceExperience() {
        return StringUtils.nullable(currentPlaceExperience);
    }

    public void setCurrentPlaceExperience(String currentPlaceExperience) {
        this.currentPlaceExperience = currentPlaceExperience;
    }

    public int getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(int salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    public int getChangeSalaryIn_12_Month() {
        return changeSalaryIn_12_Month;
    }

    public void setChangeSalaryIn_12_Month(int changeSalaryIn_12_Month) {
        this.changeSalaryIn_12_Month = changeSalaryIn_12_Month;
    }

    public String getCity() {
        return StringUtils.nullable(city);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompanySize() {
        return StringUtils.nullable(companySize);
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    public String getCompanyType() {
        return StringUtils.nullable(companyType);
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return StringUtils.nullable(education);
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getUniversity() {
        return StringUtils.nullable(university);
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    public String getEnglishLevel() {
        return StringUtils.nullable(englishLevel);
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public String getSubjectArea() {
        return StringUtils.nullable(subjectArea);
    }

    public void setSubjectArea(String subjectArea) {
        this.subjectArea = subjectArea;
    }

    public String getDate() {
        return StringUtils.nullable(date);
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserAgrnt() {
        return StringUtils.nullable(userAgrnt);
    }

    public void setUserAgrnt(String userAgrnt) {
        this.userAgrnt = userAgrnt;
    }
}
