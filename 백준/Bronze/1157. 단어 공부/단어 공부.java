import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str1 = scanner.next().toUpperCase();
		
		int[] aa = new int[26];
		
		for (int i=0; i<str1.length(); i++) {
			int num = str1.charAt(i)-'A';
			aa[num] = aa[num]+1;
			
		}
		
		int max =0 ;
		char answer  = '?';
		for (int i=0; i<aa.length; i++) {
			if (aa[i]>max) {
				max = aa[i];
				answer = (char)(i+'A');
	
				
			}
			else if (aa[i] == max) {
				answer = '?';
			
					
			}
			
		}
		System.out.print(answer);			
		
	}

}
