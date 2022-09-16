package EncapsulaationExample;

public class EmployeeData {
	//1) How to implement encapsulation (encapsulate)
	//make the instance variables private(which cannot be accessed directly outside the class 
	//Encapsulation: We are using the access modifiers for the variables as "private". Here the three variables or fields are assigned private because 
	//no one outside the class can access those variables.
	//If we really want to access the variables outside the class then we need to define the  "getter and setter methods"
	//getter and setter methods must be public to access the class private variables.
	//advantages of encapsulation
	//1 it is flexible
	//2 how many variables are there (this information is hidden 
	//3 reusability of the code 
	//4 we can access the variables
	//5 these variables can be made read only.
	
	private int ssn;
	private int empno;
	private String empname;
	
	//2) We have to generate getter and setter methods------right click  goto source->generate getter and setter methods
	//To get and set the values of the fields.
	

	public static void main(String[] args) {
	//3) We need to create an object of the class to set the values to the fields
		EmployeeData Employee=new EmployeeData();
		Employee.setEmpname("Kalpana");
		Employee.setEmpno(1);
		Employee.setSsn(123456);
		
	//now get the values of the fields
		System.out.println("Employee Name : " +Employee.getEmpname());
		System.out.println("Employee No : " +Employee.getEmpno());
		System.out.println("Employee SSN : " +Employee.getSsn());
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
		//this.classvariable=local variable
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

}
