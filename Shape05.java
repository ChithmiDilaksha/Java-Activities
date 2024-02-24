 class Rectangle
 {
	 private double length;
	 private double width;
	 
	 public Rectangle(double length,double width)
	 {
		 this.length=length;
		 this.width=width;
	 }
	 public Rectangle()
	 {
		 length=20.00;
		 width=2.00;
	 }
	 
	 public void DisplayArea()
	 {
		 double area = length*width;
		 System.out.println("\nRectangle area is "+area);
	 }
 }
 class Shape05
 {
	 public static void main(String[] args)
	 {
		 Rectangle r1=new Rectangle(11.00,2.00);
		 r1.DisplayArea();
		 Rectangle r2=new Rectangle();
		 r2.DisplayArea();
	 }
 }
 