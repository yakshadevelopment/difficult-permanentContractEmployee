package java8.diff.employeeApp;
import java.text.DecimalFormat;
public class PermanentEmployee extends Employee {
	private Double monthlySalary;
	private Double pfContribution;
	private Double tax;
	private static int idgen=1000;
	public static String generateId()
	{
		String id="P";
		idgen++;
		id=id+idgen;
		return id;
		
	}
	public PermanentEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PermanentEmployee(String employeeId, String employeeName, String department,
			Double monthlySalary, Double pfContribution) {
		super(employeeId, employeeName, department);
		this.monthlySalary = monthlySalary;
		this.pfContribution = pfContribution;
	}
	public Double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(Double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public Double getPfContribution() {
		return pfContribution;
	}
	public void setPfContribution(Double pfContribution) {
		this.pfContribution = pfContribution;
	}
	
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	public void calculateTax()
	{
		double annualSalary=monthlySalary*12;
		tax=annualSalary/10;
	}
	@Override
	public String toString() {
		String str=super.toString();
		DecimalFormat df=new DecimalFormat("0.00");
		String salary=df.format(monthlySalary);
		String pf=df.format(pfContribution);
		String tx=df.format(tax);
		String output=str+String.format("%-10s %-10s %-10s",salary,pf,tx);
		return output;
	}
}
