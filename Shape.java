class Circle
{
    public double radius;
    
    public void calculateArea()
	{
		double area = Math.PI*radius*radius;
		System.out.println("Area of the circle "+area);
	}

    public double calculateCircumference()
	{
		double Circumference = 2*Math.PI*radius;
		return Circumference;
	}	
}

class Shape
{
    public static void main (String[]args)
	{
		Circle c1=new Circle();
		c1.radius=5.0;
	    c1.calculateArea();
		
		double Circumference = c1.calculateCircumference();
		System.out.println("Circumference of the circle : "+Circumference);
		
	}
	
}