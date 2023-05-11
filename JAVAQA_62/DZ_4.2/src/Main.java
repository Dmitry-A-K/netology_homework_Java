public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double r = 1.87;
        double m = 98;
        int bmi = service.calculate(r,m);
        System.out.println("При росте "+ r +" м. и весе "+ m +" кг., индекс массы тела составит "+ bmi);
    }
}