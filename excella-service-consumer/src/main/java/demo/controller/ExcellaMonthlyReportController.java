package demo.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import demo.domain.ExcellaReportPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/monthly-report")
public class ExcellaMonthlyReportController {

    @Autowired
    RestTemplate restTemplate;

    @Value("http://excella-service-provider")
    private String excellaServiceProvider;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @HystrixCommand(fallbackMethod = "getDefault")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ExcellaReportPojo getExcellaMonthlyReport() {
        return restTemplate.getForObject(excellaServiceProvider + "/api/monthly-report/dashboardMetrics", ExcellaReportPojo.class);
    }

    public ExcellaReportPojo getDefault() {
        ExcellaReportPojo excellaReportPojo = new ExcellaReportPojo();
        excellaReportPojo.setHeadCount(292);
        return excellaReportPojo;
    }

}
