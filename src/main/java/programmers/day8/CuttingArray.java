package programmers.day8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CuttingArray {

    public static void main(String[] args) {
        CuttingArray ca = new CuttingArray();
        System.out.println(Arrays.toString(ca.solution(new int[]{1, 2, 3, 4, 5}, 1, 3)));
        System.out.println(Arrays.toString(ca.solution(new int[]{1, 3, 5}, 1, 2)));
    }

    public int[] solution(int[] numbers, int num1, int num2) {
//        return IntStream.range(num1, num2).map(v -> numbers[v]).toArray();
        return Arrays.copyOfRange(numbers, num1, num2);
    }
}
