package in.devops.employee.service.VO;


import in.devops.employee.service.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//wrapper object containing both employee and department details

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate {

    private Employee emp;
    private Department dep;
}
