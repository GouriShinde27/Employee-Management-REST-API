package employee_management.repository;
import java.util.List;
import employee_management.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartment(String department);
    Employee findByEmail(String email);

}