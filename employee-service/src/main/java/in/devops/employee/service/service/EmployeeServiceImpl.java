package in.devops.employee.service.service;

import in.devops.employee.service.VO.Department;
import in.devops.employee.service.VO.ResponseTemplate;
import in.devops.employee.service.entity.Employee;
import in.devops.employee.service.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Employee saveEmployee(Employee emp) {
        log.info("Saving Employee Details ... In Service method");
        log.info("Saving Employee Details ... Calling Repository Object");
        return employeeRepository.save(emp);
    }

    @Override
    public ResponseTemplate getEmployeeById(Integer empId) {
        ResponseTemplate ro = new ResponseTemplate();
        log.info("calling Emp service for details");
        Employee emp = employeeRepository.findByEmpId(empId);
        log.info("calling Department microservice for dep details");
       // Department dp = restTemplate.getForObject("http://localhost:8082/department/"+emp.getEmpDepartmentId(),Department.class);
        Department dp = restTemplate.getForObject("http://DEP-SVC/department/"+emp.getEmpDepartmentId(),Department.class);
        ro.setEmp(emp);
        ro.setDep(dp);
        return ro;
    }
}
