package com.mongant.analytics.dao;

import java.util.List;

public class SqlBuilder {

    public String getSql(List<String> parameters, String genderParam) {
        StringBuilder sb = new StringBuilder();
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
        return sb.toString();
    }
}
