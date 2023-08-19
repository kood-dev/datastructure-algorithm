package programmers.day9;

/*
가위는 2 바위는 0 보는 5로 표현합니다.
가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        RockPaperScissors rps = new RockPaperScissors();
        System.out.println(rps.solution("2")); // 0
        System.out.println(rps.solution("205")); // 052
    }

    public String solution(String rsp) {
        final char rock = '0';
        final char scissors = '2';
        final char paper = '5';

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == rock) {
                sb.append(paper);
            } else if (rsp.charAt(i) == scissors) {
                sb.append(rock);
            } else if (rsp.charAt(i) == paper) {
                sb.append(scissors);
            }
        }
        return sb.toString();
    }

}
