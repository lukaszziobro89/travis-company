package pl.departments;

import pl.department.Department;
import pl.department.DepartmentType;
import pl.employee.Employee;
import pl.job.Job;
import java.util.List;

public class FinanceDepartment extends Department {
    public FinanceDepartment(DepartmentType departmentName, List<Job> jobList, List<Employee> employeesList) {
        super(departmentName, jobList, employeesList);
    }

    public FinanceDepartment(DepartmentType departmentName) {
        super(departmentName);
    }

    public FinanceDepartment(int departmentId, DepartmentType departmentType, List<Job> jobList) {
        super(departmentId, departmentType, jobList);
    }
}
