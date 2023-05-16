public class Main {
    public static void main(String[] args) {

        double userBill = 35;           // Начальный счет
        double userPay4 = 3645.95;


        int bonusMin = 1000;            // Минимальная сумма
        int bonusDivider = 100;         // Делитель
        int bonus = 1;                  // Бонусных рублей


        // ПРИМЕР 4
        System.out.println("...........  ПРИМЕР 4");
        System.out.println("На вашем счету было " + userBill);
        if (userPay4 > bonusMin) {
            int bonusResult = (int) userPay4 / bonusDivider * bonus;
            System.out.println("Вы внесли " + userPay4 + ", а мы добавили " + bonusResult + " рублей");
            System.out.println("На вашем счету стало " + (userBill + userPay4 + bonusResult));
        } else {
            System.out.println("Для получения бонусов внесите сумму больше " + bonusMin + " рублей");
            System.out.println("На вашем счету стало " + (userBill + userPay4));
        }

    }
}