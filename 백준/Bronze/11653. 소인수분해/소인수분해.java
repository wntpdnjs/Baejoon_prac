import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	int num = scanner.nextInt();
    	int[] divierarr = new int[num];
    	int i=2;
    	while(num != 1) {
    		if(num % i ==0) {
    			System.out.println(i);
    			num = num/i;
    			
    		}else {
    			i++;
    		}
	    	
	    	
    	}
    	
    	

    }
}
