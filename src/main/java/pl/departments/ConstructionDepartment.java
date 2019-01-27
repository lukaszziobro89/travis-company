package pl.departments;

import pl.department.Department;
import pl.department.DepartmentType;
import pl.employee.Employee;
import pl.job.Job;
import java.util.List;

public class ConstructionDepartment extends Department {
    public ConstructionDepartment(DepartmentType departmentName, List<Job> jobList, List<Employee> employeesList) {
        super(departmentName, jobList, employeesList);
    }

    public ConstructionDepartment(DepartmentType departmentName) {
        super(departmentName);
    }
}
