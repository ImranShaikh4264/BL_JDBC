
public class Employee {
int id;
String name;
String city;
int salary;
int age;
public Employee(int id, String name, String city, int salary, int age) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.salary = salary;
	this.age = age;
}
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
