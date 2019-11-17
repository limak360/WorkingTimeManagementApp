package com.KamilJacko.service;

import com.KamilJacko.entity.Stats;

import java.io.PrintWriter;
import java.util.List;

public interface InfoService {

    List<Stats> info();

    void writeDataToCsv(PrintWriter writer);
}
