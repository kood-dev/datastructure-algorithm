package programmers.day4;

import java.util.Arrays;

public class AverageArray {

    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }

    public static void main(String[] args) {
        AverageArray aa = new AverageArray();
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("average: 5.5, result: " + aa.solution(ints));

        System.out.println("average: 5.5, result: " + aa.solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));

    }

}
