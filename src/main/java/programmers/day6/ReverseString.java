package programmers.day6;

public class ReverseString {
    public static String solution(String my_string) {
        StringBuilder reverse = new StringBuilder(my_string).reverse();
        return reverse.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("jaron"));
        System.out.println(solution("bread"));
    }
}
