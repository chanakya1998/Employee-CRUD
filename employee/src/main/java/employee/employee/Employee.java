package employee.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
int id;
String name ;
String city;
String contact;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", contact=" + contact + "]";
}
public Employee(int id, String name, String city, String contact) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.contact = contact;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
}
