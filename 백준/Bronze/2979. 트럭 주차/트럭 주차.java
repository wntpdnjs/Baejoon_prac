
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int[] numArr = new int[100];
    	int ans = 0;
    	int aa=0;
    	int bb=0;
    	int cc=0;
    	String input = scanner.nextLine();     
        String[] tokens = input.split(" ");
        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[1]);
        int c = Integer.parseInt(tokens[2]);
        

        
        for (int i=0; i<3; i++) {
        	String num = scanner.nextLine();     
            String[] inter = num.split(" ");
            int d = Integer.parseInt(inter[0]);
            int e = Integer.parseInt(inter[1]);
            
            for(int j=d; j<e; j++) {
            	numArr[j] +=1;
            	
            }
            
           
        	
        }
        
        for(int i=0; i<numArr.length; i++) {
        	if(numArr[i]==1) {
        		aa += a*1;
        		
        	}
        	else if(numArr[i]==2) {
        		bb += b*2;
        		
        	}
        	else if(numArr[i]==3) {
        		cc += c*3;
        		
        	}
        }

        ans = aa+bb+cc;
        
        System.out.print(ans);
    	
    	
    }
}