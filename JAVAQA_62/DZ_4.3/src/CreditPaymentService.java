public class CreditPaymentService {
    public int calculate(int creditSum, int creditEyar, double creditTax) {

        double tax = creditTax / 12 / 100;
        double stp = Math.pow((1 + tax), (creditEyar * 12));
        double cof = (tax * stp) / (stp - 1);
        double result = cof * creditSum;
        return (int) result;

    }
}
