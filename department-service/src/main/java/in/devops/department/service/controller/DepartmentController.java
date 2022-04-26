package in.devops.department.service.controller;

import in.devops.department.service.entity.Department;
import in.devops.department.service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/")
    public String hello(){
        return "<h1>Welcome to Department Service";
    }

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department dp){
        return departmentService.save(dp);
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable("id") Integer depId){
        return departmentService.findById(depId);
    }
}
