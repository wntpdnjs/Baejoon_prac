import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int a = scanner.nextInt();

    	int[] intArr1 = new int[a];
    	int[] intArr2 = new int[a];
    	
    	int min1 = Integer.MAX_VALUE;
    	int max1 = Integer.MIN_VALUE;
    	int min2 = Integer.MAX_VALUE;
    	int max2 = Integer.MIN_VALUE;
    	
    	
    	if(a>=2) {
    		for (int i=0; i<a; i++) {
    			int[] numArr = {scanner.nextInt(), scanner.nextInt()};
    			
    			intArr1[i] = numArr[0];
    			intArr2[i] = numArr[1];
    					
    		}
    		
    	}else {
    		int[] numArr = {scanner.nextInt(), scanner.nextInt()};
			
    		System.out.print(0);
    		return ; 
    		
    	}
    	
    	for (int i : intArr1) {
    	    min1 = Math.min(min1, i);
    	    max1 = Math.max(max1, i);	
    	}
    	
    	for (int i : intArr2) {
    	    min2 = Math.min(min2, i);
    	    max2 = Math.max(max2, i);	
    	}
    	
    	System.out.print((max1-min1)*(max2-min2));
    	
    	
    }
}
