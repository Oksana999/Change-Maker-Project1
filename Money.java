import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		System.out.println("Enter your change: ");
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt() ;
		
		System.out.println(makeChange(amount));

	}
	
	public static int quarters(int amount) { 
		return amount / 25; 
		} 

	public static int dimes(int amount) { 
		return (amount - quarters(amount) * 25) / 10; 
		} 

	public static int nickels(int amount) { 
		return (amount - (quarters(amount) * 25) - (dimes(amount) * 10)) / 5; 
		} 

	public static int pennies(int amount) { 
		return amount - (quarters(amount) * 25) - (dimes(amount) * 10) - (nickels(amount) * 5); 
		} 
		public static String makeChange( int amount) { 
		String s = "Your change is: " + quarters(amount) +" quaters, " 
		 + dimes( amount ) + " dimes, " + nickels( amount ) + 
		" nickels, " + pennies( amount )+" pennies"; 
		return s;
		} 
		
		

}
