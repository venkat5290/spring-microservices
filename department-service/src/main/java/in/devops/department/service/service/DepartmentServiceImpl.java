package in.devops.department.service.service;

import in.devops.department.service.entity.Department;
import in.devops.department.service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department save(Department dp) {
        return departmentRepository.save(dp);
    }

    @Override
    public Department findById(Integer depId) {
        return departmentRepository.findByDepartmentId(depId);
    }
}
