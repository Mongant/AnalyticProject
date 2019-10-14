package com.mongant.analytics.dao;

import com.mongant.analytics.entity.DeveloperSalary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class DeveloperSalaryDaoImpl implements DeveloperSalaryDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    public DeveloperSalaryDaoImpl() {
    }

    @Override
    public List<DeveloperSalary> getDeveloperSalaryResult(List<String> parameters, String genderParam) {
        SqlBuilder sqlBuilder = new SqlBuilder();
        String sql = sqlBuilder.getSql(parameters, genderParam);
        return jdbcTemplate.query(sql, new DeveloperSalaryMapper());
    }
}
