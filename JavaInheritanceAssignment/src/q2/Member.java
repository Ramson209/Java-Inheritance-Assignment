package q2;

public class Member
{
	String name;
	int age;
	String number;
	String address;
	int salary;
	
	public void printSalary() {
		System.out.println(salary);
	}
}
class Employee extends Member{
	String specialization;
}

class Manager extends Member{
	String department;
}

class answer{
	public static void main(String[] args)
	{
		Employee e = new Employee();
		
		e.name="Ramson";
		e.age=29;
		e.number="+233275010296";
		e.address="A 43/5";
		e.salary=1000;
		e.specialization="software engineer";
		
		System.out.println("The name of the employee is : " + e.name);
		System.out.println("The age of the employee is : " + e.age);
		System.out.println("The phone number of the employee is : " + e.number);
		System.out.println("The adress of the employee is : " + e.address);
		System.out.println("The salary of the employee is : " + e.salary);
		System.out.println("The specialization of the employee is : " + e.specialization);
		System.out.println();
		
		Manager m = new Manager();
		e.name="Harry";
		e.age=40;
		e.number="233244352483";
		e.address="A 34/2";
		e.salary=5000;
		e.specialization ="Database engineer";
			
		System.out.println("The name of the manager is : " + e.name);
		System.out.println("The age of the manager is : " + e.age);
		System.out.println("The phone number of the manager is : " + e.number);
		System.out.println("The address of the manager is : " + e.address);
		System.out.println("The salary of the manager is : " + e.salary);
		System.out.println("The specialization of the manager is : " + e.specialization);

	}

	}
