public class BmiService {
    public int calculate(double height, double weight) {
        double bmi;
        bmi = weight / (height * height);
        return (int) bmi;
    }
}
