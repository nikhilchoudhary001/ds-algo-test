package bluestack;

import java.util.Arrays;
import java.util.Date;

public final class Employee {
	private final int employeeID;
	private final String employeeName;
	private final Date dob;
	
	public Employee(int employeeID, String employeeName, Date dob) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.dob = dob;
	}
	
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public Date getDob() {
		Date newDate = (Date) dob.clone();
		return newDate;
	}


	@Override
	public int hashCode() {
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}


	@Override
	public String toString() {
		return "Employee ID : " + this.employeeID + "     Employee Name : " + this.employeeName + "       Employee DOB : " + this.dob;
	}

}
