class Rectangle
 {
	 private double length;
	 private double width;
	 
	 // parameter Constructor
	 public Rectangle(double length,double width)  
	 {
		 this.length=length;
		 this.width=width;
	 }
	  // Default Constructor
	 public Rectangle() 
	 {
		 length=20.00;
		 width=2.00;
	 }
	  //  copy constructor
     public Rectangle(Rectangle obj)
     {
	     this.length=obj.length;
	     this.width=obj.width;
     }
   
	 
	 public void DisplayArea()
	 {
		 double area = length*width;
		 System.out.println("\nRectangle area is "+area);
	 }
 }
 // Main Constructor
 class Shape005
 {
	 public static void main(String[] args)
	 {
		 Rectangle r1=new Rectangle(11.00,2.00);
		 r1.DisplayArea();
		 
		 Rectangle r2=new Rectangle(); //argiuments
		 r2.DisplayArea();
		 
		 Rectangle r3=new Rectangle();
		 r3.DisplayArea();
		 
		 Rectangle r4=new Rectangle();
		 r4.DisplayArea();
		 
		 
	 }
 }
// * constructor overloading