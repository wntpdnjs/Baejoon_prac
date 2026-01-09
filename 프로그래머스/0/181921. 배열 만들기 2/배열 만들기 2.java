import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (onlyZeroFive(i)) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            return new int[]{ -1 };
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    private boolean onlyZeroFive(int x) {
        while (x > 0) {
            int d = x % 10;
            if (d != 0 && d != 5) return false;
            x /= 10;
        }
        return true;
    }
}
