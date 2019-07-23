import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner x = new Scanner(System.in);
	    
	    System.out.print("Enter First Number : ");
	    double a = x.nextInt();
	    
	    System.out.print("Enter Second Number : ");
	    double b = x.nextInt();
	    
	    double c = a*b;
	    
	    System.out.println();
	    System.out.println("The Product of the Two Numbers is : ");
		System.out.println(c);
	}
}
