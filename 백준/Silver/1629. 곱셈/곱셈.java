import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static long c;
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

    	long a = scanner.nextLong();
    	long b = scanner.nextLong();
    	c = scanner.nextLong();
    	
    	System.out.println(pow( a, b));
    	
    	
    }

	private static long pow(long a, long b) {
		if(b==1) {
			return a%c;
		}
		
		long temp = pow(a,b/2);
		
		if(b%2==1 ) {
			return(temp*temp%c)*a%c;
		}
		return temp*temp%c;
		
				
	}
    
}