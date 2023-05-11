public class Main {
    public static void main(String[] args) {

        double userBill = 35;           // Начальный счет
        double userPay1 = 950;          // Суммы взноса
        double userPay2 = 1001;
        double userPay3 = 1999;
        double userPay4 = 3645.95;


        int bonusMin = 1000;            // Минимальная сумма
        int bonusDivider = 100;         // Делитель
        int bonus = 1;                  // Бонусных рублей




        // ПРИМЕР 1
        System.out.println("........... ПРИМЕР 1");
        System.out.println("На вашем счету было " + userBill);
        if(userPay1 > bonusMin){
            int bonusResult = (int) userPay1 / bonusDivider * bonus;
            System.out.println("Вы внесли "+ userPay1 +", а мы добавили "+ bonusResult +" рублей");
            System.out.println("На вашем счету стало " + (userBill + userPay1 + bonusResult));
        }else {
            System.out.println("Вы внесли "+ userPay1 +" Для получения бонусов внесите сумму больше "+ bonusMin +" рублей");
            System.out.println("На вашем счету стало " + (userBill + userPay1));
        }

        // ПРИМЕР 2
        System.out.println("...........  ПРИМЕР 2");
        System.out.println("На вашем счету было " + userBill);
        if(userPay2 > bonusMin){
            int bonusResult = (int) userPay2 / bonusDivider * bonus;
            System.out.println("Вы внесли "+ userPay2 +", а мы добавили "+ bonusResult +" рублей");
            System.out.println("На вашем счету стало " + (userBill + userPay2 + bonusResult));
        }else {
            System.out.println("Для получения бонусов внесите сумму больше "+ bonusMin +" рублей");
            System.out.println("На вашем счету стало " + (userBill + userPay2));
        }

        // ПРИМЕР 3
        System.out.println("...........  ПРИМЕР 3");
        System.out.println("На вашем счету было " + userBill);
        if(userPay3 > bonusMin){
            int bonusResult = (int) userPay3 / bonusDivider * bonus;
            System.out.println("Вы внесли "+ userPay3 +", а мы добавили "+ bonusResult +" рублей");
            System.out.println("На вашем счету стало " + (userBill + userPay3 + bonusResult));
        }else {
            System.out.println("Для получения бонусов внесите сумму больше "+ bonusMin +" рублей");
            System.out.println("На вашем счету стало " + (userBill + userPay3));
        }

        // ПРИМЕР 4
        System.out.println("...........  ПРИМЕР 4");
        System.out.println("На вашем счету было " + userBill);
        if(userPay4 > bonusMin){
            int bonusResult = (int) userPay4 / bonusDivider * bonus;
            System.out.println("Вы внесли "+ userPay4 +", а мы добавили "+ bonusResult +" рублей");
            System.out.println("На вашем счету стало " + (userBill + userPay4 + bonusResult));
        }else {
            System.out.println("Для получения бонусов внесите сумму больше "+ bonusMin +" рублей");
            System.out.println("На вашем счету стало " + (userBill + userPay4));
        }

    }
}