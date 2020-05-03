package com.kamiljacko.dao;

import com.kamiljacko.entity.CsvHelper;
import com.kamiljacko.entity.Stats;
import com.opencsv.CSVWriter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.List;

@Repository
public class InfoDAOImpl
        implements InfoDAO {
    private final JdbcTemplate jdbcTemplate;

    public InfoDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Stats> info() {

        String sql = "SELECT project_id, SUM(hours) as hours from Project_Employee group by project_id";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Stats.class));
    }

    @Override
    public void writeDataToCsv(PrintWriter writer) {
        String sql = "Select employee.first_name, employee.last_name, employee.total_hours, project_employee.project_id, SUM(project_employee.hours) as hours from employee, project_employee where employee.id=project_employee.employee_id group by first_name , project_id;";

        List<CsvHelper> csvHelper = jdbcTemplate.query(sql, new BeanPropertyRowMapper(CsvHelper.class));

        String[] CSV_HEADER = {"first name", "last name", "total hours", " project id", "hours"};
        try (
                CSVWriter csvWriter = new CSVWriter(writer,
                        CSVWriter.DEFAULT_SEPARATOR,
                        CSVWriter.NO_QUOTE_CHARACTER,
                        CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                        CSVWriter.DEFAULT_LINE_END);
        ) {
            csvWriter.writeNext(CSV_HEADER);

            for (CsvHelper csvHelper1 : csvHelper) {
                String[] data = {
                        csvHelper1.getFirst_name(),
                        csvHelper1.getLast_name(),
                        csvHelper1.getTotal_hours().toString(),
                        csvHelper1.getProject_id().toString(),
                        csvHelper1.getHours().toString()
                };
                csvWriter.writeNext(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}