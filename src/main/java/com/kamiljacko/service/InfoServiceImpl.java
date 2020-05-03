package com.kamiljacko.service;

import com.kamiljacko.dao.InfoDAO;
import com.kamiljacko.entity.Stats;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.PrintWriter;
import java.util.List;

@Service
public class InfoServiceImpl
        implements InfoService {
    private final InfoDAO infoDAO;

    public InfoServiceImpl(InfoDAO infoDAO) {
        this.infoDAO = infoDAO;
    }

    @Override
    @Transactional
    public List<Stats> info() {
        return infoDAO.info();
    }

    @Override
    @Transactional
    public void writeDataToCsv(PrintWriter writer) {
        infoDAO.writeDataToCsv(writer);
    }
}