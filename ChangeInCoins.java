
public class ChangeInCoins {

	public static void main(String[] args) {
		int change = 15;
	
		System.out.println(coinValueList(change));
	}
	
	public static String coinValueList(int change) {
	String str = " Your change: "+quarter(change)+" quarters "+dimes(change)+" dimes "+nickels(change)
	+" nickels "+pennies(change)+" pennies";
	return str;
	}
	
	public static int quarter(int change) {
	int q = change / 25;
	return q;
	}
	public static int dimes(int change) {
		int d = ((change - (quarter(change) * 25)) / 10);
		return d;
		}
	public static int nickels(int change) {
		int n = (((change - (quarter(change) * 25) -(dimes(change) * 10))) / 5);
		return n;
	}
	public static int pennies(int change) {
		int p = (change - (quarter(change) * 25) - (dimes(change) * 10) - (nickels(change) * 5));
		return p;
		
	}
	
}

