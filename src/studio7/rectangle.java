package studio7;

//instance variables (has-a's)
public class rectangle {
	private int length;
	private int width;
	//methods (things the object can do)
	public rectangle(int length, int width)
	{
	this.length = length; //the "this" tells the computer we are talking about the instance variable and not the parameter in this method
	this.width = width;
	}
	//we have successfully created a constructor method. now lets do some more methods.
	public int area()
	{
		int area = length*width;
		return area;
	}
	public int perimeter() 
	{
		int perimeter = width + width + length + length;
		return perimeter;
	}
	public String toString()
	{
		return " Area: " + this.area() + ", Perimeter: " + this.perimeter();
	}
	public static void main(String[] args)
	{
		 rectangle rectangle1 = new rectangle(2, 4); //here were are creating an object rectangle1, where rectangle is a new type we created when we created the public class.
		rectangle1.area();//here we are calling the area method
		rectangle1.perimeter();//here we are calling the perimeter method
		System.out.println(rectangle1);
	}
}
