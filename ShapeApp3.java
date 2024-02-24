class Rectangle
{
     private double length;
	 private double width;
	 
	 public void setlength(double length)
	 
	 {
		 this.length=length;
	 }
	 
	 public void setwidth(double width)
	 {
		 this.width=width;
	 }
	 
	 public double getlength()
	 {
		 return length;
	 }
	 
	 public double getwidth()           // display karanwa nam          -> void
	 {                                  // values  return karanawa  nam -> double
		 return width;
	 }
	 public void displayArea()
	 {
		 double area = length*width;
		 System.out.println("Area is "+area);
	 }
}

class ShapeApp3
{
     public static void main (String[] args)
	 {
		 Rectangle R1=new Rectangle();
		 R1.setlength(5.0);
		 R1.setwidth(4.0);
		 R1.displayArea();
		 double circumfarance = 2*(R1.getlength()+R1.getwidth());
		 System.out.println("Circumfarance is "+circumfarance);
		 
	 }
}
