class Animal
{
	private String AnimalNumber;
	private String AnimalType;
	private int AnimalBirthYear;
	
	public void setAnimalNumber(String AnimalNumber) 
	{
        this.AnimalNumber = AnimalNumber;
    }
    public void setAnimalType(String AnimalType) 
	{
        this.AnimalType = AnimalType;
    }

    public void setAnimalBirthYear(int AnimalBirthYear) 
	{
        this.AnimalBirthYear = AnimalBirthYear;
    }
	
	public int getage(int age)
	{
		return age;
	}
	
	public void DisplayDetails()
	{
		int CurrantYear=2023;
		int age = CurrantYear-AnimalBirthYear;
		
		System.out.println("Animal Number: "+AnimalNumber);
        System.out.println("Type: "+AnimalType);
        System.out.println("Birth Year: "+AnimalBirthYear);
        System.out.println("Age: "+age+" years");		
	}
	
}

class Zoo
{
	public static void main (String[] args)
	{
		Animal A1=new Animal();
		A1.setAnimalNumber("A001");
		A1.setAnimalType("Bird");
		A1.setAnimalBirthYear(2013);
		A1.DisplayDetails();
	}
}
