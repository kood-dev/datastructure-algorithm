package programmers.day4;

public class SplitPizza {
    public int solution(int n) {
        return n % 7 == 0 ? n / 7 : n / 7 + 1;
    }

    public static void main(String[] args) {
        SplitPizza sp = new SplitPizza();

        System.out.println("solution = 1 ," + sp.solution(7));

        System.out.println("solution = 1 ," + sp.solution(1));

        System.out.println("solution = 3 ," + sp.solution(15));
    }
}
