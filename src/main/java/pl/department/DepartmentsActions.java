package pl.department;

import pl.employee.Employee;
import pl.job.Job;

import java.util.List;

public interface DepartmentsActions {
    void addJobToJobList(Job job);
    void addEmployeeToEmployeesList(Employee employee);
    void addEmployeeToEmployeesList(List<Employee> employees);
}
