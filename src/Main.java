public class Main {
    public static void main(String[] args) {
        int sum = 500;
        int deposit = 1100;

        int bonus = 0;
        if (deposit > 1000) {
            bonus = deposit / 100;
        }

        int finalSum = sum + deposit + bonus;
        System.out.println("Конечная_сумма: " + finalSum);
        System.out.println("Начисленные_бонусы: " + bonus);
    }
}

