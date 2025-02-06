package programmers.monthly_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class supoja {
    
    public int[] solution(int[] answers) {
        // 수포자들의 찍는 패턴
        int[][] patterns = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        
        // 최종 점수 저장 
        int[] scores = new int[3];
        // 최고 점수
        int maxScore = 0;
        // 최고 점수를 받은 수포자 카운트
        int countMax = 0;

        // 채첨 과정
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < patterns.length; j++) {
                // 정답 == 패턴[사람][찍은번호찾기]
                /* 
                    이건 그냥 외워야 함. "% 연산을 이해하자"
                    - 답안지의 index의 값과 수포자가 찍은 값을 찾기 위해서는 수포자의 패턴을 답안지의 indexf로 % 연산 하면 된다.

                    patterns[j][i % patterns[j].length] 풀이
                    i 는 문제번호, j는 수포자를 말한다.
                    즉, 문제번호에 해당하는 수포자의 찍은번호를 가져오기 위함이다.
                    
                    i = 0, j = 0 인경우 0번째 문제의 0번째 수포자의 답을 가져오기 위해서는 
                    0 % 5 = 0 이기 때문에 patterns[j][0]이며 1을 가지고 온다
                */ 

                if (answers[i] == patterns[j][i % patterns[j].length]) {
                    // j수포자 정답 카운트 증가
                    scores[j]++;

                    // 최고 점수
                    if (scores[j] > maxScore) {
                        maxScore = scores[j];
                        countMax = 1;
                    } else if (scores[j] == maxScore) {
                        // 최고 점수를 받은 사람이 여러명인 경우
                        countMax ++;
                    }
                }
            }
        }

        // 최고 점수 찾기
        // int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        // 최고 점수를 받은 수포자 찾기
        // List<Integer> result = new ArrayList<>();
        // for (int i = 0; i < 3; i++) {
        //     if (scores[i] == maxScore) {
        //         result.add(i + 1); // 1-based index로 저장
        //     }
        // }

        // 리스트를 배열로 변환하여 반환
        // return result.stream().mapToInt(i -> i).toArray();

        // 최고 점수를 받은 수포자 
        int[] refactorResult = new int[countMax];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            if (scores[i] == maxScore) {
                refactorResult[index++] = i + 1; // 1-based index
            }
        }
        return refactorResult;
    }

    public static void main(String[] args) {
        supoja sol = new supoja();
        
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 3, 2, 4, 2})));
    }
}
