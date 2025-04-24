import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	int x = scanner.nextInt();
    	int y = scanner.nextInt();
    	int w = scanner.nextInt();
    	int h = scanner.nextInt();

    	
    	int width =0;
    	int height =0;
    	
    	width = w-x;
    	height = h-y;
    	
    	int[] arr = {x,y,width, height};
    	int min = arr[0];
    	
    	for (int i=0; i<4; i++) {
    		if(arr[i]<min) {
    			min = arr[i];
    		}
    	}
    	
     System.out.print(min);
    }
}
