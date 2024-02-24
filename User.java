class User
 {
    private String Password;
	
	public User()
	{
	     Password="X12345";
	}
	
	public void setPassword(String Password)
	{
		 this.Password=Password;
	}
	
	public String getPassword()
	{
		 return Password;
	}
	
 }	
 

class Login
{
	public static void main(String[] args)
	{
		User u1=new User();
		System.out.println("Your password is "+u1.getPassword());
		
	    u1.setPassword("Chithmi123");
		System.out.println("You change password to "+u1.getPassword());
	
	}
}
