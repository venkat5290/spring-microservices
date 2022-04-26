package in.devops.employee.service.service;

import in.devops.employee.service.VO.ResponseTemplate;
import in.devops.employee.service.entity.Employee;


public interface EmployeeService {

    Employee saveEmployee(Employee emp);

    ResponseTemplate getEmployeeById(Integer empId);
}
