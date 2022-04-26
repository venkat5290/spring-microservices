package in.devops.department.service.service;

import in.devops.department.service.entity.Department;

public interface DepartmentService {

    Department save(Department dp);

    Department findById(Integer depId);
}
