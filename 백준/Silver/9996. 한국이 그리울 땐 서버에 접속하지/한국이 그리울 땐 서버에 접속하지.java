import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String pattern = scanner.next();
        String[] split = pattern.split("\\*");
        String prefix = split[0];
        String postfix = split[1];

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num; i++) {
            String file = scanner.next();

            if (file.length() < prefix.length() + postfix.length()) {
                result.append("NE\n");
                continue;
            }

            boolean starts = file.startsWith(prefix);
            boolean ends = file.endsWith(postfix);

            if (starts && ends) {
                result.append("DA\n");
            } else {
                result.append("NE\n");
            }
        }

        System.out.print(result);
    }
}