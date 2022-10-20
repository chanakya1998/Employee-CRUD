package employee.employee;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {
 
	@Autowired
	SessionFactory sf;
	
	ArrayList<Employee> getdata(){
	Session ss = sf.openSession();
	Criteria cc= ss.createCriteria(Employee.class);
	ArrayList<Employee> al = (ArrayList<Employee>)cc.list();
		return al;
	}
	
	public Employee enterdata (@RequestBody Employee emp ) {
		Session ss= sf.openSession();
		Transaction ts = ss.beginTransaction();
		ss.save(emp);
		
		ts.commit();
			ss.close();	
		return emp;
	}
	public Employee updateEmployee(@RequestBody Employee emp) {
		Session session=sf.openSession();
		Transaction ts=session.beginTransaction();
		session.update(emp);
	ts.commit();
		session.close();
		return emp;
	}
public Employee delete(int id) {
	Session ss = sf.openSession();
	Employee ee = ss.get(Employee.class, id);
	Transaction  ts = ss.beginTransaction();
	ss.delete(ee);
	ts.commit();
	ss.close();
		return ee;	
}
	
}
