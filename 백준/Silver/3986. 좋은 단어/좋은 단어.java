import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int count=0;
    	int num = scanner.nextInt();
    	
    	for (int i=0; i<num; i++) {
    		String str = "";
    		str= scanner.next();
    		char[] charArr = str.toCharArray();
    		Stack<Character> stack = new Stack<>();
    		stack.push(charArr[0]);
    		
    		for(int j=1; j<charArr.length; j++) {
    			if( stack.size()>0 && stack.peek()==charArr[j] ) {
    				stack.pop();
    			}
    			else {
    				stack.push(charArr[j]);
    			}
    		}
    		if(stack.isEmpty()) count++;
    	}
    	System.out.print(count);
    }
    
}