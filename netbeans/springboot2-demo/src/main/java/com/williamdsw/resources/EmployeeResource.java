package com.williamdsw.resources;

import com.williamdsw.domain.Employee;
import com.williamdsw.repositories.EmployeeRepository;
import com.williamdsw.service.EmployeeDto;
import java.util.List;
import java.util.Optional;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author William
 */
@RestController
@RequestMapping(path = "/employees", produces = APPLICATION_JSON_VALUE)
public class EmployeeResource {

    private final EmployeeRepository repository;

    public EmployeeResource(EmployeeRepository repository) {
        this.repository = repository;
    }

    // List all employees
    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> listAll() {
        return this.repository.findAll();
    }

    // List employee by ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getByID(@PathVariable Long id) {
        Optional<Employee> employee = this.repository.findById(id);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        }

        return ResponseEntity.notFound().build();
    }

    // Post employee data
    @RequestMapping(method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> post(@RequestBody EmployeeDto input) {
        Employee employee = new Employee();
        employee.setName(input.getName());
        employee.setEmail(input.getEmail());
        return ResponseEntity.ok(this.repository.save(employee));
    }

    // Delete employee by ID
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Optional<Employee> employee = this.repository.findById(id);
        if (employee != null) {
            this.repository.deleteById(id);
            return ResponseEntity.ok().build();
        }

        return ResponseEntity.notFound().build();
    }
}