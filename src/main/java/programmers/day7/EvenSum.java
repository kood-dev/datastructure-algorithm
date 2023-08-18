package programmers.day7;

import java.util.stream.IntStream;

public class EvenSum {

    public int solution(int n) {
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        return sum;

        return IntStream.rangeClosed(0, n)
                .filter(i -> i % 2 == 0)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(new EvenSum().solution(10));
        System.out.println(new EvenSum().solution(4));
    }
}
