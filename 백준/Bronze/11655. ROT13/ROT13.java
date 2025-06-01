import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		char[] charArr = str.toCharArray();
		
		for (int i=0; i<charArr.length; i++) {
			int num = (int)charArr[i];
			
			if(num>=65 && num<=90) {
				if(num+13 <=90) {
					charArr[i]=((char)(num+13));
				}
				else {
					charArr[i]=((char)(64+(num+13-90)));
				}
			}
			else if (num>=97 && num<=122) {
				if(num+13 <=122) {
					charArr[i]=((char)(num+13));
				}
				else {
					charArr[i]=((char)(96+(num+13-122)));
				
				}
				
			}
			else {
				continue;
			}
		}
		for (int i=0; i<charArr.length; i++) {
			System.out.print(charArr[i]);
		}
		

		
		
	
		
		
	}
}