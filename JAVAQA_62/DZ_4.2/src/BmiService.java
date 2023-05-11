public class BmiService {
    public int calculate(double r, double m){
        double bmi;
        bmi = m / (r * r);
        return (int) bmi;
    }
}
