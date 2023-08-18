package org.example;

public class Main {
    public static void main(String[] args) {

//        int[][] data = new int[][]{{1,0,0,0}, {0,0,0,1}, {0,0,1,0}, {0,1,1,0}};
//        int[][] data = new int[][]{{1,0,0}, {0,0,1}, {1,0,0}};
//        int k = 2;
//        System.out.println(solution(data, 2));
        System.out.println(solution(3));
    }


    // 히터 카운트 1번문제..
    /*
    public static int solution(int[][] office, int hitCount) {
        int answer = 0;
        int officeLen = office.length;
        System.out.println(officeLen);
        System.out.println(hitCount);
        for (int i = 0; i <= officeLen - hitCount; i++) {
            for (int j = 0; j <= officeLen - hitCount; j++) {
                int count = 0;

                for (int x = i; x < i + hitCount; x++) {
                    for (int y = j; y < j + hitCount; y++) {
                        if (office[x][y] == 1) {
                            count++;
                        }
                    }
                }
                answer = Math.max(answer, count);
            }
        }

        return answer;
    }

     */

    // 악수 - 3번문제
    public static int solution(int N) {
        int answer = 0;
        int[][] dp = new int[N][2];

        dp[0][0] = 1;
        dp[0][1] = 0;

        for (int i = 1; i < N; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
            dp[i][1] = dp[i - 1][0];
        }
        answer = dp[N - 1][0] + dp[N - 1][1];
        return answer;

//        dp = [(1,0)];
//        dp.append((dp[i][0]+dp[i][1], dp[i][0]))

    }

    /*public static int solution(int N) {
        int[] left = new int[N];
        left[0] = 1;
        for (int i = 1; i < N; i++) {
            left[i] = left[i-1] + (i-1)*2 + 1;
        }
        int total = 1;
        for (int i = 0; i < N; i++) {
            total *= left[i];
        }
        return total;
    }*/

/*
2번 문제
    public static long solution(int n) {
        long answer = 0;
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                answer += Math.pow(3, count);
            }
            count++;
            n = (n >> 1);
        }

        return answer;
    }
*/


}