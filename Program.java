import java.util.Scanner;
public class Program
{
	Scanner s = new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("HELLO");
		Program program = new Program();
		program.start();
	}
	public int sum(int a, int b)
	{
		return a + b;
	}
<<<<<<< HEAD
	public int power(int a ,int b)
	{
		return a * b;
=======
	public void start()
	{
		int a = input("first number");
		int b = input("seccont number");
		System.out.println("Sum of numbers" + sum(a,b));
	}
	public int input(String text)
	{
		System.out.println(text);
		return s.nextInt();
>>>>>>> Scanner
	}
		
}