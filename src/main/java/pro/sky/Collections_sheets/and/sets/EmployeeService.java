package pro.sky.Collections_sheets.and.sets;

import java.util.Collection;
import java.util.Collections;

public interface EmployeeService {
    Employee add(String firstName, String lastName);

    Employee add(Employee employee);

    Employee remove(String firstName, String lastName);

    Employee remove(Employee employee);

    Employee find(String firstName, String lastName);

    Collection<Employee> findAll();
}