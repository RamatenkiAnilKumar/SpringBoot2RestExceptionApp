package in.nareshit.raghu.handler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import in.nareshit.raghu.exception.EmployeeNotFoundException;
import in.nareshit.raghu.model.ErrorType;

@ControllerAdvice
public class MyExceptionHandler {
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ErrorType> handlerEmpNotFound(EmployeeNotFoundException ex){
		
		System.out.println("New Sysout added in SpringBoot Application ");
		
		return new ResponseEntity<ErrorType>
		(
				new ErrorType(ex.getMessage(),"NO_EMP_FOUND","DATA NOT FOUND FOR GIVEN ID","Employee", "WELCOME MY ID"),
				HttpStatus.BAD_REQUEST);
				
				
	}
	
	

}
