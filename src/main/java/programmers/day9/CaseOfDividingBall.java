package programmers.day9;

/*
머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다.
머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
*/

import java.math.BigInteger;

public class CaseOfDividingBall {

    public static void main(String[] args) {
        CaseOfDividingBall codb = new CaseOfDividingBall();
        System.out.println(codb.solution(3, 2)); // 3
        System.out.println(codb.solution(5, 3)); // 10
        System.out.println(codb.solution(30, 10)); // 10
    }

    public int solution(int balls, int share) {
//        return factorial(balls) / (factorial(balls - share) * (factorial(share)));
        return factorial(balls).divide(factorial(balls - share).multiply(factorial(share))).intValue();
    }

//    public int factorial(int num) {
//        if (num == 1) {
//            return 1;
//        }
//        return num * factorial(num - 1);
//    }
    public BigInteger factorial(int num) {
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
