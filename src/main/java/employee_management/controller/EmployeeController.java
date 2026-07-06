package employee_management.controller;

import employee_management.entity.Employee;
import employee_management.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    // Add Employee
    @PostMapping
    public Employee addEmployee(@Valid @RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    // Get All Employees
    @GetMapping
    public List<Employee> getEmployees() {
        return service.getAllEmployees();
    }

    // Get Employee By ID
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }

    // Update Employee
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id,
                                   @RequestBody Employee employee) {
        return service.updateEmployee(id, employee);
    }

    @GetMapping("/department/{department}")
    public List<Employee> getEmployeesByDepartment(@PathVariable String department) {
        return service.getEmployeesByDepartment(department);
    }

    @GetMapping("/email/{email}")
    public Employee getEmployeeByEmail(@PathVariable String email) {
        return service.getEmployeeByEmail(email);
    }

    // Delete Employee
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
        return "Employee deleted successfully!";
    }
}