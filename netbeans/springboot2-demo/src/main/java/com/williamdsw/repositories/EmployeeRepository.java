
package com.williamdsw.repositories;

import com.williamdsw.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author William
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}