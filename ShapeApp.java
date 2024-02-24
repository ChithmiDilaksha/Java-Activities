class Cylinder
{
     private double radius; // This is private variable.So we can't add radius value
	 private double height;
	 public double volume;
	 
	 public void setradius(double radius)  //(double x)
	 {
		 this.radius=radius;  //radius  is setradius function and this.radius=private radius.
		 	// radius	= x;	 
	 }
	 public void setheight(double height)
	 {
		 this.height=height;
	 }
	 
	 public void findVolume() //static is not use 
	 {
		 volume=3.14*radius*radius*height;
	 }
	 
	 public double returnVolume()
	 {
		 return volume;
	 }
}

class ShapeApp
{
     public static void main(String[]args)
	 {
		 Cylinder c1=new Cylinder();
		 c1.setradius(7.00);             
		 c1.setheight(4.5);
		 c1.findVolume();
		 double v=c1.returnVolume();
		 System.out.println("Volume is "+v);
	 }
} 

// setter , set function -> radius variable is private.
// setter should be private