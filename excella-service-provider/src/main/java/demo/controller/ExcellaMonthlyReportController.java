package demo.controller;


import demo.domain.ExcellaReportPojo;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RefreshScope
@RestController
@RequestMapping("/monthly-report")
public class ExcellaMonthlyReportController {

    private ExcellaReportPojo excellaReportPojo;

    @Bean
    @PostConstruct
    public ExcellaReportPojo init() {
        excellaReportPojo = new ExcellaReportPojo();
        excellaReportPojo.setBdPipeline(126);
        excellaReportPojo.setHeadCount(292);
        excellaReportPojo.setRecrutingPipeline(24);
        excellaReportPojo.setBenchPluse(1.78);
        return excellaReportPojo;
    }

    @RequestMapping(value = "/dashboardMetrics", method = RequestMethod.GET)
    public ExcellaReportPojo getStudents() {
        return excellaReportPojo;
    }
}
