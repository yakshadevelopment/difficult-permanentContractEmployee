package java8.diff.employeeApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number of Employees.");
		int empNumbers=Integer.parseInt(scanner.nextLine());
		Employee emp=null;
		List<Employee> parmanentList=new ArrayList<Employee>();
		List<Employee> contractList=new ArrayList<Employee>();
		System.out.println("Enter all Employees details...");
		for(int i=0;i<empNumbers;i++)
		{
			String empInfo=scanner.nextLine();
			String arr[]=empInfo.split(",");
			if(arr.length==3)
			{
				double salary=Double.parseDouble(arr[2]);
				double pf=salary*0.15;
				String id=PermanentEmployee.generateId();
				emp=new PermanentEmployee(id,arr[0],arr[1],salary,pf);
				emp.calculateTax();
				parmanentList.add(emp);
			}
			else if(arr.length==4)
			{
				int period=Integer.parseInt(arr[2]);
				double amount=Double.parseDouble(arr[3]);
				String id=ContractEmployee.generateId();
				emp=new ContractEmployee(id,arr[0],arr[1],period,amount);
				emp.calculateTax();
				contractList.add(emp);
			}
		}
		Collections.sort(parmanentList);
		Collections.reverse(contractList);
		System.out.println("\nParmanent Employee List");
		String output=String.format("%-10s %-20s %-15s %-10s %-10s %-10s","Id","Name","Department","Salary","PF","Tax");
	     System.out.println(output);
		for(Employee employee:parmanentList)
	    	System.out.println(employee);
	    System.out.println("\nContract Employee List");
		 output=String.format("%-10s %-20s %-15s %-10s %-10s %-10s","Id","Name","Department","Period","Amount","Tax");
		 System.out.println(output);
		 for(Employee employee:contractList)
	    	System.out.println(employee);
	}
}