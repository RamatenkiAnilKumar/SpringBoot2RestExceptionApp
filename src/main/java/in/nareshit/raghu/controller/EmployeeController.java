package in.nareshit.raghu.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.exception.EmployeeNotFoundException;
import in.nareshit.raghu.model.Employee;

@RestController
public class EmployeeController {
	
	
	//added comment here
	@GetMapping("/find/{id}")
	public ResponseEntity<Employee> getOneEmployee(@PathVariable Integer id) throws EmployeeNotFoundException
	{
		if(id!=5) 
			
			throw new EmployeeNotFoundException("Employee Not foind Exception +"+id);
			
			return ResponseEntity.ok(new Employee(id,"ANILKUMAR"));

		}
	}
		
		
		
	
	
	


