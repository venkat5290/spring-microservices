package in.devops.department.service.repository;

import in.devops.department.service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    Department findByDepartmentId(Integer departmentId);
}
