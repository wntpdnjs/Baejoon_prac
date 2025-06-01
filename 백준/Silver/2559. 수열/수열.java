import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt(); 
        int num2 = scanner.nextInt(); 

        int[] intArr = new int[num1];
        for (int i = 0; i < num1; i++) {
            intArr[i] = scanner.nextInt();
        }

        int max = 0;

        for (int i = 0; i <= num1 - num2; i++) {
            int sum = 0;
            for (int j = i; j < i + num2; j++) {
                sum += intArr[j];
            }
            if (sum > max || i == 0) {
                max = sum;
            }
        }

        System.out.print(max);
    }
}
