import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] intArr = new int[26];
		boolean isExist = false;
		
		int cnt = scanner.nextInt();
		for (int i=0; i<cnt; i++) {
			String str = scanner.next();
			char[] strArr = str.toCharArray();
			
			int ascii = (int)strArr[0];
			
			intArr[ascii-97] +=1;
			
		}
		
		for (int i=0; i<intArr.length; i++) {
			if (intArr[i]>=5) {
				System.out.print((char)(i+97));
				isExist = true;
			}
		}
		if (isExist== false) {
			System.out.print("PREDAJA");
		}
		
	
		
		
	}
}
