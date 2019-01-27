package pl.departments;

import pl.department.Department;
import pl.department.DepartmentType;
import pl.employee.Employee;
import pl.job.Job;
import java.util.List;

public class ITDepartment extends Department {
    public ITDepartment(DepartmentType departmentName, List<Job> jobList, List<Employee> employeesList) {
        super(departmentName, jobList, employeesList);
    }

    public ITDepartment(DepartmentType departmentName) {
        super(departmentName);
    }
}
