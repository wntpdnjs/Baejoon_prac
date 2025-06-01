import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt(); 
        int num2 = scanner.nextInt(); 
        int sum=0;
        int ans =0;
        int[] intArr = new int[num1];
        
        for(int i=0; i<num1; i++) {
        	intArr[i] = scanner.nextInt();
        }
        
        for(int i=0; i<intArr.length-1; i++) {
        	for(int j=i+1; j<intArr.length; j++) {
        		sum = intArr[i]+intArr[j];
        		if (sum == num2) {
        			ans +=1;
        		}
        	}
        }
        System.out.print(ans);
        
        
        


       
    }
}
