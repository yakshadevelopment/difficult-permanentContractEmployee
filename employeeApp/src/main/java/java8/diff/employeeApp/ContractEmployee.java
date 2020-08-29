package java8.diff.employeeApp;
import java.text.DecimalFormat;

public class ContractEmployee extends Employee {
	private Integer contractPeriod;
	private Double contractAmount;
	private Double tax;
	private static int idgen=1000;
	public static String generateId()
	{
		String id="C";
		idgen++;
		id=id+idgen;
		return id;
		
	}
	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public ContractEmployee(String employeeId, String employeeName, String department,Integer contractPeriod, Double contractAmount) {
		super(employeeId, employeeName,department);
		this.contractPeriod = contractPeriod;
		this.contractAmount = contractAmount;
	}
	
	public Integer getContractPeriod() {
		return contractPeriod;
	}
	public void setContractPeriod(Integer contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	public Double getContractAmount() {
		return contractAmount;
	}
	public void setContractAmount(Double contractAmount) {
		this.contractAmount = contractAmount;
	}
	@Override
	public String toString() {
		DecimalFormat df=new DecimalFormat("0.00");
		String amount=df.format(contractAmount);
		String tx=df.format(tax);
		String str=super.toString();
		String output=str+String.format("%-10s %-10s %-10s ",contractPeriod,amount,tx);
		return output;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	@Override
	public void calculateTax() {
		double annualIncome=contractAmount/contractPeriod;
		tax=annualIncome/10;
	}

}
