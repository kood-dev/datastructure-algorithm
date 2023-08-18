package programmers.day4;

public class SplitPizza3 {
    public int solution(int slice, int n) {


        return n % slice == 0 ? n / slice : n / slice + 1;
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
        SplitPizza3 sp = new SplitPizza3();

        System.out.println("solution = 2 ," + sp.solution(7, 10));

        System.out.println("solution = 3 ," + sp.solution(4, 12));

    }
}
