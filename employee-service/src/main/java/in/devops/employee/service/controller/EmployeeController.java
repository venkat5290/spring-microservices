package in.devops.employee.service.controller;

import in.devops.employee.service.VO.ResponseTemplate;
import in.devops.employee.service.entity.Employee;
import in.devops.employee.service.service.EmployeeService;
import in.devops.employee.service.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee emp){
        log.info("Saving Employee Details ... In Controller method");
        return employeeService.saveEmployee(emp);
    }

   //Creating get method to return Wrapper Object:ResponseTemplate
    @GetMapping("/{id}")
    public ResponseTemplate getEmployeedetails(@PathVariable("id") Integer empId){
        return employeeService.getEmployeeById(empId);
    }
}

