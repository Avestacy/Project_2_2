public class Main {
    public static void main(String[] args) {
        int startBalance = 1000; //начальный баланс на счету
        int addSum = 2000;  //сумма пополнения счета

        int bonus = 0;
        if (addSum > 1000) {
            bonus = addSum / 100;
        } else {
            bonus = 0;
        }
        int totalBalans = startBalance + addSum + bonus;

        System.out.print("Бонус за пополнение счета: " + bonus);
    }
}
