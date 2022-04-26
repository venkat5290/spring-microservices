package in.devops.employee.service.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    private Integer departmentId;
    private String departmentName;
    private String departmentLocation;
    private String departmentCode;

}

