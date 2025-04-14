import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (isGroupWord(word)) {
                result++;
            }
        }

        System.out.println(result);
    }

    private static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26];
        char prev = 0;

        for (int i = 0; i < word.length(); i++) {
            char now = word.charAt(i);

            if (now != prev) {
                if (seen[now - 'a']) {
                    return false;
                }
                seen[now - 'a'] = true;
            }

            prev = now;
        }

        return true;
    }
}
