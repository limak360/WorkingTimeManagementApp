package com.kamiljacko.dao;


import com.kamiljacko.entity.Stats;

import java.io.PrintWriter;
import java.util.List;

public interface InfoDAO {
    List<Stats> info();

    void writeDataToCsv(PrintWriter writer);
}