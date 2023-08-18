package programmers.day7;

import java.util.Arrays;

public class RemoveWord {
    public static String solution(String my_string, String letter) {
        String replace = my_string.replace(letter, "");
        return replace;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcdef", "f"));
        System.out.println(solution("BCBdbe", "B"));
    }
}
