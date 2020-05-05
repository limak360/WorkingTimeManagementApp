package com.kamiljacko.service;

import com.kamiljacko.entity.Stats;

import java.io.PrintWriter;
import java.util.List;

public interface InfoService {
    List<Stats> info();

    void writeDataToCsv(PrintWriter writer);
}