public class BmiService {
    public int calculate(double kilograms, double meters) {
        double b = kilograms / (meters * meters);
        int a = (int) b;
        return a;
    }
}
