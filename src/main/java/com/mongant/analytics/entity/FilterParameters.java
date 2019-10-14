package com.mongant.analytics.entity;

import java.util.List;

public class FilterParameters {

    public List<String> positions;
    public String gender;

    public FilterParameters() {
    }

    public FilterParameters(List<String> positions, String gender) {
        this.positions = positions;
        this.gender = gender;
    }

    public List<String> getPositions() {
        return positions;
    }

    public void setPositions(List<String> positions) {
        this.positions = positions;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
