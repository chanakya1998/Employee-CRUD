package employee.employee;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EplpyeeController {
 @Autowired
 EmployeeService es;
 @RequestMapping("featchdata")
 ArrayList<Employee> getdata(){
	 ArrayList<Employee> ee=es.getdata();
	 return ee;
 }
 @PostMapping("enterdata")
 public Employee entersdata (@RequestBody Employee emp ) {
	 Employee ee = es.enterdata(emp);
	 return ee;
 }
 @PutMapping("update")
 public Employee updateEmployee(@RequestBody Employee emp) {
		Employee ee=es.updateEmployee(emp);
		return ee;
	}
 @DeleteMapping("delete/{id}")
 public Employee delete(@PathVariable int id) {
	 Employee ee = es.delete(id);
	 return ee;
 }

}
