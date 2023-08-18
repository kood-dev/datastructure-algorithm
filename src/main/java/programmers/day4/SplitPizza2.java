package programmers.day4;

public class SplitPizza2 {
    public int solution(int n) {
        return lcm(n, 6) / 6;
    }

    // 최대 공약수
    public int gcd(int x, int y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }

    // 최소 공배수
    public int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }


    public static void main(String[] args) {
        SplitPizza2 sp = new SplitPizza2();

        System.out.println("solution = 1 ," + sp.solution(6));

        System.out.println("solution = 1 ," + sp.solution(10));

        System.out.println("solution = 3 ," + sp.solution(4));
    }
}
