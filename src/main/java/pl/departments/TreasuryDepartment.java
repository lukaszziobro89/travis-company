package pl.departments;

import pl.department.Department;
import pl.department.DepartmentType;
import pl.employee.Employee;
import pl.job.Job;
import java.util.List;

public class TreasuryDepartment extends Department {

    public TreasuryDepartment(DepartmentType departmentName, List<Job> jobList, List<Employee> employeesList) {
        super(departmentName, jobList, employeesList);
    }

    public TreasuryDepartment(DepartmentType departmentName) {
        super(departmentName);
    }
}
