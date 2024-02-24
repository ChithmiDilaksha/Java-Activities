class Employee
{
	private String empoyee_id;
    private String empoyee_name;
    private double basic_salary;
    private int service_years;
    private double monthly_incentive;

	
	public void inputDetails(String empoyee_id,String empoyee_name,double basic_salary,int service_years)
	{
		this.empoyee_id=empoyee_id;
		this.empoyee_name=empoyee_name;
		this.basic_salary=basic_salary;
		this.service_years=service_years;
		
	}
	public void findIncentiveAmount() 
	{
        if (service_years>15) 
		{
            monthly_incentive = 0.13 * basic_salary;
        } 
		else if (service_years>10) 
		{
            monthly_incentive = 0.10 * basic_salary;
        } 
		else if (service_years>5) 
		{
            monthly_incentive = 0.05 * basic_salary;
        }
    }
	
	public void displayDetails() 
	{
        double totalIncome = basic_salary + monthly_incentive ;
        System.out.println("Employee ID: " + empoyee_id);
        System.out.println("Employee Name: " + empoyee_name);
        System.out.printf("Total Income: %.2f%n", totalIncome);
    }
}


class XYZ_Company
{
	public static void main(String[] args) 
	{
		
		 Employee e1 = new Employee();
         Employee e2 = new Employee();
         Employee e3 = new Employee();

      
         e1.inputDetails("e001","Saman",75000.00,4);
         e1.findIncentiveAmount();

         
         e2.inputDetails("e002","kamal",50000.00,10);
         e2.findIncentiveAmount();

         
         e3.inputDetails("e003","nimal",40000.00,20);
         e3.findIncentiveAmount();

         System.out.println("\nEmployee 1 Details:");
         e1.displayDetails();

         System.out.println("\nEmployee 2 Details:");
         e2.displayDetails();

         System.out.println("\nEmployee 3 Details:");
         e3.displayDetails();
		
	}
}