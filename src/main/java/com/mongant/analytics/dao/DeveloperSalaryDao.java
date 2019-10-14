package com.mongant.analytics.dao;

import com.mongant.analytics.entity.DeveloperSalary;

import java.util.List;

public interface DeveloperSalaryDao {
    List<DeveloperSalary> getDeveloperSalaryResult(List<String> parameters, String genderParam);
}
