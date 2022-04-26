package in.devops.cloud.gateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fallback")
public class FallBackController {

    @GetMapping("/empFallBack")
    public String employeeFallBackMethod(Exception e){
        return "Employee Service is taking longer than expected."+"\n"+"Please Try again after sometime";
    }

    @GetMapping("/depFallBack")
    public String departmentFallBackMethod(Exception e){
        return "Department Service is taking longer than expected."+"\n"+"Please Try again after sometime";
    }
}
