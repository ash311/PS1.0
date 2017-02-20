package pkgShape;

import java.util.Scanner;

public class cMain {

	public static void main(String[] args) {

		double Length;
		double Width;
		Scanner input = new Scanner(System.in);
		
		for (int a = 0;a<2;a++)
		{
			
			System.out.println("Enter Length");
			Length = input.nextDouble();
			
			System.out.println("Enter Width");
			Width = input.nextDouble();
			
			Rectangle rec1 = new Rectangle(Length,Width);
			
			System.out.println("Area of Rectangle: " + rec1.Area());		
			
			System.out.println("Nbr of rectangles " + Rectangle.GetNbrOfRectangles());
		}

	}

}
