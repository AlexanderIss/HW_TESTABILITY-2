public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double exampleKilograms = 84;
        double exampleMeters = 1.75;
        int bmi = service.calculate(exampleKilograms, exampleMeters);
        System.out.println("Индекс Bmi: " + bmi); // ожидаемый ответ 27
    }
}
