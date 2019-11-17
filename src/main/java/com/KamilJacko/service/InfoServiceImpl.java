package com.KamilJacko.service;

import com.KamilJacko.dao.InfoDAO;
import com.KamilJacko.entity.Stats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.PrintWriter;
import java.util.List;

@Service
public class InfoServiceImpl
        implements InfoService {

    @Autowired
    private InfoDAO infoDAO;

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
