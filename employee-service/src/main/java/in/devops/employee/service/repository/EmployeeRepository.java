package in.devops.employee.service.repository;

import in.devops.employee.service.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee findByEmpId(Integer empId);
}
