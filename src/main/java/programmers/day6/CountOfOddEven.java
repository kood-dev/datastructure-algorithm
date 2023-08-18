package programmers.day6;

import java.util.Arrays;

public class CountOfOddEven {
    public static int[] solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for (int j : num_list) {
            System.out.println(j);
            System.out.println(j % 2);
            if (j % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        return new int[]{even, odd};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5, 7})));
    }
}
