package SFTE_212_Java_II.week16;
import java.io.*;


public class try_catch {
    public static void main(String[] args)
	{
		int a = 5;
		int b = 0;
		try {
			System.out.println(a / b); // throw Exception
		}
		catch (ArithmeticException e) {
			// Exception handler
			System.out.println(
				"Divided by zero operation cannot possible");
		}
	}
}


