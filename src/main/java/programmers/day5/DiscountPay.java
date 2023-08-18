package programmers.day5;

public class DiscountPay {
    public static int solution(int price) {
        double discountPercent = 1;
        if (price >= 500000) {
            discountPercent = 0.8;
        } else if (price >= 300000) {
            discountPercent = 0.9;
        } else if (price >= 100000) {
            discountPercent = 0.95;
        }

        return (int)Math.floor(price * discountPercent);
    }

    public static void main(String[] args) {

        System.out.println(DiscountPay.solution(150000) == 142500);
        System.out.println(DiscountPay.solution(580000) == 464000);
        System.out.println(DiscountPay.solution(183250) == 464000);
    }
}
