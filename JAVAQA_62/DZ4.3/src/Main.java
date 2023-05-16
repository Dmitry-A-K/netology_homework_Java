public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // Пример 1
        int creditSum = 1_000_000;
        int creditEyar = 1;
        double creditTax = 9.99;

        double creditPay = service.calculate(creditSum, creditEyar, creditTax);
        System.out.println("Пример 1 .....");
        System.out.println("Кредит " + creditSum + "руб, на срок " + creditEyar + "г. по ставке " + creditTax + "% годовых");
        System.out.println("Ежемесячный платёж по кредиту составит " + creditPay);
        System.out.println(" ");

        // Пример 2
        creditEyar = 2;

        creditPay = service.calculate(creditSum, creditEyar, creditTax);
        System.out.println("Пример 2 .....");
        System.out.println("Кредит " + creditSum + "руб, на срок " + creditEyar + "г. по ставке " + creditTax + "% годовых");
        System.out.println("Ежемесячный платёж по кредиту составит " + creditPay);
        System.out.println(" ");

        // Пример 3
        creditEyar = 3;

        creditPay = service.calculate(creditSum, creditEyar, creditTax);
        System.out.println("Пример 3 .....");
        System.out.println("Кредит " + creditSum + "руб, на срок " + creditEyar + "г. по ставке " + creditTax + "% годовых");
        System.out.println("Ежемесячный платёж по кредиту составит " + creditPay);
        System.out.println(" ");
    }
}