import java.util.Scanner; // Import the Scanner class

class Saloon 
{
    private String name;
    private String address;
    private String phoneNumber;

    public Saloon(String name, String address, String phoneNumber) 
	{
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName()
	{
        return name;
    }

    public String getAddress() 
	{
        return address;
    }

    public String getPhoneNumber()
	{
        return phoneNumber;
    }
}

class HairStyle
 {
    private String name;
    private String specialization;

    public HairStyle(String name, String specialization) 
	{
        this.name = name;
        this.specialization = specialization;
    }

    public String getName()
	{
        return name;
    }

    public String getSpecialization() 
	{
        return specialization;
    }
}
class 
{
	
}

class Customer 
{
    private String name;
    private String Address;
    private String ContactNumber;

    public Customer(String name, String Address, String PhoneNumber)
	{
        this.name = name;
        this.Address = Address;
        this.ContactNumber = PhoneNumber; 
    }

    public String getName()
	{
        return name;
    }

    public String getAddress()
	{
        return Address;
    }

    public String getContactNumber() 
	{
        return ContactNumber;
    }
}



class Appointment 
{
    private String date;
    private String time;
    private HairStyle HairCut1; 
    private Customer customer;

    public Appointment(String date, String time, Customer customer, HairStyle HairCut1)
	{
        this.date = date;
        this.time = time;
        this.customer = customer;
        this.HairCut1 = HairCut1;
    }

    public String getDate() 
	{
        return date;
    }

    public String getTime() 
	{
        return time;
    }

    public HairStyle getHairStyle() 
	{
        return HairCut1;
    }

    public Customer getCustomer() 
	{
        return customer;
    }
}

public class MASTER_SALON
{
    public static void main(String[] args) 
	{
        try 
	    {
               if (System.getProperty("os.name").contains("Windows"))
				{
                
				    new ProcessBuilder("cmd", "/r", "cls").inheritIO().start().waitFor();
                } 
				
        } 
	    catch (Exception c) 
		{
            c.printStackTrace();
        }
		
		Scanner scanner = new Scanner(System.in); 

        Saloon salon = new Saloon("Saloon Curl Up", "123/A Main street,Galle", "047-633-984");

        // Print salon information
        System.out.println("\n");
        System.out.println("----Saloon Information--------------");
        System.out.println("\n");
        System.out.println("Salon Name: " + salon.getName());
        System.out.println("Address: " + salon.getAddress());
        System.out.println("Phone Number: " + salon.getPhoneNumber());
        System.out.println("\n");

        // Prompt the user for customer information
        System.out.println("----Customer Information--------------");
        System.out.println("\n");
        System.out.println("Enter Customer Name:");
        String customerName = scanner.nextLine();

        System.out.println("Enter Customer Address:");
        String customerAddress = scanner.nextLine();

        System.out.println("Enter Customer Contact Number:");
        String customerContactNumber = scanner.nextLine();
		System.out.println("\n");

        Customer customer = new Customer(customerName, customerAddress, customerContactNumber);

        // Prompt the user for hairstyle information
        System.out.println("----Specialization Information---------");
        System.out.println("\n");
        System.out.println("Enter the Specialization:");
        String hairCutSpecialization = scanner.nextLine();
        System.out.println("Enter the relevant specialization type:");
        String hairCutName = scanner.nextLine();
		System.out.println("\n");

        HairStyle HairCut1 = new HairStyle(hairCutName, hairCutSpecialization);

        // Prompt the user for appointment information
        System.out.println("----Time & Date--------------");
        System.out.println("\n");
        System.out.println("Enter Appointment Date:");
        String appointmentDate = scanner.nextLine();
        System.out.println("Enter Appointment Time:");
        String appointmentTime = scanner.nextLine();
		System.out.println("\n");

        Appointment appointment = new Appointment(appointmentDate, appointmentTime, customer, HairCut1);

        // Print appointment information
        System.out.println("----Full Appointment Details--------------");
        System.out.println("\n");
		System.out.println("Customer Name: " + appointment.getCustomer().getName());
        System.out.println("Customer Address: " + appointment.getCustomer().getAddress());
        System.out.println("Contact Number: " + appointment.getCustomer().getContactNumber());
		System.out.println("Hair Cut Name: " + appointment.getHairStyle().getName());
        System.out.println("Specialization: " + appointment.getHairStyle().getSpecialization());
        System.out.println("Date: " + appointment.getDate());
        System.out.println("Time: " + appointment.getTime());

        scanner.close(); 
    }
}