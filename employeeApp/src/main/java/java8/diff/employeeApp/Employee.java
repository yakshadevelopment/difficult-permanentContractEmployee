package java8.diff.employeeApp;

public abstract class Employee implements Comparable<Employee>
{
	private String employeeId;
	private String employeeName;
	private String department;
	public Employee(String employeeId, String employeeName, String department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
	}
	public Employee() {
		super();
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		String output=String.format("%-10s %-20s %-15s",employeeId,employeeName,department);
		return output;
	}
	public int compareTo(Employee emp)
	{
		return this.employeeId.compareTo(emp.employeeId);
	}
	public abstract void calculateTax();
}
