package com.KamilJacko.rest;

import com.KamilJacko.entity.Stats;
import com.KamilJacko.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/view")
public class ViewController {

    @Autowired
    InfoService infoService;

    @GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Stats> info() {

        return infoService.info();
    }

    @GetMapping("/report")
    public void downloadCSV(HttpServletResponse response) throws IOException {

        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; file=data.csv");

        infoService.writeDataToCsv(response.getWriter());
    }
}
