package oops;
/*
 * 1. Create an Employee Class
 * 2. Create class variable for Employee Name, Employee ID, Employee Salary
 * 3. Create a method to calculate and display Employee bonus(20% of Employee Salary)
 * 4. Create an Employee Main class with a Main Method
 * 5. Crate 2 Objects of Employee Class in Employee_Main
 * 6. Assign values to variables and call the method from Employee Class by using the objects created in step 5
 * */
public class Employee {

	String name = "Mohi";
	String Id = "E29";
	float Salary = 50000;

public void display(float sal) 
{
	sal = Salary;
	float bonus = Salary*20/100;
	System.out.println("Name	= "+name+"\nEmp ID	= "+Id+"\nSalary	= "+Salary+" \nBonus	= "+bonus+"(20%)");
}
public static void main(String[] args) {
	
	Employee e1 = new Employee();
	e1.name = "mohit";
	e1.Id = "e1";
	e1.Salary = 55000;
	e1.display(55000);
	
	System.out.println("	 *****	Employee 2	**** ");
	Employee e2 = new Employee();
	e2.name = "Kumar";
	e2.Id= "e2";
	e2.display(45000);
}





}
