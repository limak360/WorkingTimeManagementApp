package com.kamiljacko.entity;

public class CsvHelper {
    private String first_name;
    private String last_name;
    private Integer total_hours;
    private Integer project_id;
    private Integer hours;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getTotal_hours() {
        return total_hours;
    }

    public void setTotal_hours(Integer total_hours) {
        this.total_hours = total_hours;
    }

    public Integer getProject_id() {
        return project_id;
    }

    public void setProject_id(Integer project_id) {
        this.project_id = project_id;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "CsvHelper{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", total_hours=" + total_hours +
                ", project_id=" + project_id +
                ", hours=" + hours +
                '}';
    }
}