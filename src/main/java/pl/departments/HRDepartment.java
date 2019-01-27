package pl.departments;

import pl.department.Department;
import pl.department.DepartmentType;
import pl.employee.Employee;
import pl.job.Job;
import java.util.List;

public class HRDepartment extends Department {

    public HRDepartment(DepartmentType departmentName, List<Job> jobList, List<Employee> employeesList) {
        super(departmentName, jobList, employeesList);
    }

    public HRDepartment(DepartmentType departmentName) {
        super(departmentName);
    }

    public void createHrReportForDepartment(Department department){
        // TODO: create HR report for department
    }
}
