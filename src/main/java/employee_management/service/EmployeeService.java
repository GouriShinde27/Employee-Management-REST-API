package employee_management.service;

import employee_management.entity.Employee;
import employee_management.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    // Create
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    // Read All
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // Read One
    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }
    public List<Employee> getEmployeesByDepartment(String department) {
        return repository.findByDepartment(department);
    }
    // Update
    public Employee updateEmployee(Long id, Employee employee) {

        Employee existingEmployee = repository.findById(id).orElse(null);

        if (existingEmployee != null) {
            existingEmployee.setName(employee.getName());
            existingEmployee.setEmail(employee.getEmail());
            existingEmployee.setDepartment(employee.getDepartment());
            existingEmployee.setSalary(employee.getSalary());

            return repository.save(existingEmployee);
        }

        return null;
    }
    public Employee getEmployeeByEmail(String email) {
        return repository.findByEmail(email);
    }
    // Delete
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}