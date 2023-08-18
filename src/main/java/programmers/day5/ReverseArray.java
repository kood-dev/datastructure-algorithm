package programmers.day5;

import java.util.Arrays;

public class ReverseArray {
    public static int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] result = new int[length];

        int reverseIndex = length-1;
        for (int i = 0; i < length; i++) {
            result[i] = num_list[reverseIndex-i];
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
    }
}
