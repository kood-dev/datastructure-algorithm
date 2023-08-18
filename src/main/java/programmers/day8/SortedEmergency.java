package programmers.day8;

import java.util.Arrays;

/*외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
정수 배열 emergency가 매개변수로 주어질 때
응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.*/
public class SortedEmergency {

    public int[] solution(int[] emergency) {
        int[] result = new int[emergency.length];
        int[] clone = emergency.clone();
        Arrays.sort(clone);
        System.out.println(Arrays.toString(clone));
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < clone.length; j++) {
//                System.out.println("i: " + emergency[i] + ", j: " + emergency[j]);
//                System.out.println("clone[i] :" + clone[i] + ", clone[j]: " + clone[j]);
                if (emergency[i] == clone[j]) {
                    System.out.println("emergency: " + emergency.length + ", j :" + j);
                    result[i] = emergency.length - j;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SortedEmergency se = new SortedEmergency();
//        System.out.println(Arrays.toString(se.solution(new int[]{3, 76, 24})));
        System.out.println(Arrays.toString(se.solution(new int[]{30, 10, 23, 6, 100})));
    }
}
