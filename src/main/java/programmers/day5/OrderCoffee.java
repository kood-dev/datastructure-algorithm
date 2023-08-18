package programmers.day5;

import java.util.Arrays;

public class OrderCoffee {
    static final int AMERICANO = 5500;
    public static int[] solution(int money) {
        int quotient,remainder;
        quotient = money / AMERICANO;
        remainder = money % AMERICANO;
        return new int[] {quotient, remainder};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5500)));
        System.out.println(Arrays.toString(solution(15000)));
    }
}
