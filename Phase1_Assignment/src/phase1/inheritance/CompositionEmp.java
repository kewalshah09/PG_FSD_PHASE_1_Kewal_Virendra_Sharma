package phase1.inheritance;

import java.util.ArrayList;
import java.util.List;

class Employee
{
	public int age;
	public String name;
	public int salary;
	
	Employee(String name, int age, int salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
}

class HR
{
	private final List<Employee> employee;
	
	public HR(List<Employee> employee) {
		this.employee = employee;
	}
	
	public List<Employee> gettotal()
	{
		return employee;
	}
}

public class CompositionEmp {
	
	public static void main(String args[])
	{
		Employee E1 = new Employee("ABC", 10, 100);
		Employee E2 = new Employee("ABC1", 20, 200);
		Employee E3 = new Employee("ABC2", 30, 300);
		Employee E4 = new Employee("ABC3", 40, 400);
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(E1);
		emp.add(E2);
		emp.add(E3);
		emp.add(E4);
		
		HR hr = new HR(emp);
		
		List<Employee> emps = hr.gettotal();
		
		for (Employee ep : emps)
		{
			System.out.println("Name : "+ ep.name + " age : " + ep.age + " Salary : "+ep.salary);
		}
		
		
	}

}
