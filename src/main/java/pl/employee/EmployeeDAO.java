package pl.employee;

import java.util.List;

public interface EmployeeDAO {
    /** Return list of students  */
    List<Employee> getEmployees();
}
