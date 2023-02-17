package com.tns.EmployeeService;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee_Service_Controller 
{
  @Autowired(required=true)
  private Employee_Service service;
  
  @GetMapping("/employeeservice")
  public java.util.List<Employee>list()
  {
	  return service.listAll();
  }
  @GetMapping("/employeeservice/{employee_Id}")
  public ResponseEntity <Employee> get(@PathVariable Integer Employee_Id)
  {
	  try
	  {
		Employee employee = service.get(Employee_Id);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	  }
	  catch(NoResultException e)
	  {
		  return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	  }
   
  }
	  @PostMapping("/employeeservice")
	  public void add(@RequestBody Employee employee)
	  {
		  service.save(employee);
	  }
	  @PutMapping ("/employeeservice/{employee_Id}")
	  public ResponseEntity<?> update(@RequestBody Employee employee, @PathVariable Integer Employee_Id)
	  {
		  Employee existemployee = service.get(Employee_Id);
		  service.save(existemployee);
		  return new ResponseEntity<>(HttpStatus.OK);
	  }
	  @DeleteMapping("/employeeservice/{employee_Id}")
	  public void delete (@PathVariable Integer employee_Id)
	  {
		  service.delete(employee_Id);
	  }
   
}
