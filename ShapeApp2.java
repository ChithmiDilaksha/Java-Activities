class Circle
{
     private double radius;
	 
	 public void setradius(double radius)
	 {
		 this.radius=radius;
	 }
	 public double getradius()
	 {
		 return radius;
	 }
}	 
	 
class ShapeApp2
{
     public static void main(String[] args)
	 {
		 Circle c1=new Circle();
		 c1.setradius(8.5);
		 double area=3.14*c1.getradius()*c1.getradius(); 
		 
		 System.out.println("Area is "+area);
	 }
	 
}
 
