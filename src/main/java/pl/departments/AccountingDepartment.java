package pl.departments;

import pl.department.Department;
import pl.department.DepartmentType;
import pl.employee.Employee;
import pl.job.Job;

import java.util.List;

public class AccountingDepartment extends Department {
    public AccountingDepartment(DepartmentType departmentName, List<Job> jobList, List<Employee> employeesList) {
        super(departmentName, jobList, employeesList);
    }

    public AccountingDepartment(DepartmentType departmentName) {
        super(departmentName);
    }
}
