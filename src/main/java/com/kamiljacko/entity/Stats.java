package com.kamiljacko.entity;

public class Stats {
    private int project_id;
    private int hours;

    public Stats() {
    }

    public Stats(int project_id, int hours) {
        this.project_id = project_id;
        this.hours = hours;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    @Override
    public String toString() {
        return "Stats{" +
                "project_id=" + project_id +
                ", hours=" + hours +
                '}';
    }
}