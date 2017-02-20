package pkgShape;


import java.util.Scanner;

public class Rectangle {
	

	private double Length;
	private double Width;
	private static int NbrOfRectangles = 0;
	
	public Rectangle(double length, double width) {
		NbrOfRectangles++;
		Length = length;
		Width = width;
	}
	public  double getLength() {
		return Length;
	}
	public  double getWidth() {
		return Width;
	}
	
	public double Area()
	{
		return Length * Width;
	}	
	
	public static int GetNbrOfRectangles()
	{
		return NbrOfRectangles;
	}
}

