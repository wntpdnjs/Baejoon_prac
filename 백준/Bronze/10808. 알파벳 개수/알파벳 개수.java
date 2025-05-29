
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	String word = scanner.nextLine();
    	int[] intArr = new int[26];
    	
    	char[] strArr = word.toCharArray();
    	
    	for (int i=0; i<strArr.length; i++) {
    		int ascii = ((int)strArr[i])-97;
    		
    		intArr[ascii] +=1;
    
    		
    	}
    	
    	for (int i=0; i<intArr.length; i++) {
    		System.out.println(intArr[i]);
    	}
    	
    }
}