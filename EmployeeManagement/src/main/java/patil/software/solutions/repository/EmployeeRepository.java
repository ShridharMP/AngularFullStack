package patil.software.solutions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import patil.software.solutions.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
