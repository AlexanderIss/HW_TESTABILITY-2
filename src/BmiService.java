public class BmiService {
    public int calculate(double kilograms, double meters) {
        double temporaryStorageVariable = kilograms / (meters * meters);
        int bmi = (int) temporaryStorageVariable;
        return bmi;
    }
}
