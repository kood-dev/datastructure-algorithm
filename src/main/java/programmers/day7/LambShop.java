package programmers.day7;

/*
머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면
총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
 */
public class LambShop {
    class Lamb implements Amount {
        private final int benefitQuantity = 10;
        private final int price = 12000;
        private int quantity;

        public Lamb(int quantity) {
            this.quantity = quantity;
        }

        @Override
        public int calculateAmount() {
            return price * quantity;
        }

        public int benefitCount() {
            return quantity / benefitQuantity;
        }
    }

    class Drink implements Amount {
        private final int price = 2000;
        private int quantity;

        public Drink(int quantity) {
            this.quantity = quantity;
        }
        @Override
        public int calculateAmount() {
            return price * quantity;
        }
    }

    interface Amount {
        int calculateAmount();
    }

    public int solution(int n, int k) {
        Lamb lamb = new Lamb(n);
        Drink drink = new Drink(k);

        int totalAmount = lamb.calculateAmount() + drink.calculateAmount();
        int benefitAmount = drink.quantity > 1 ? lamb.benefitCount() * drink.price : 0;
        return totalAmount - benefitAmount;
    }

    public static void main(String[] args) {
        System.out.println(new LambShop().solution(10, 3));
        System.out.println(new LambShop().solution(64, 6));
        System.out.println(new LambShop().solution(10, 0));
    }
}
