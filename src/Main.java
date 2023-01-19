public class Main {
    public static void main(String[] args) {

        BmiService information = new BmiService();
        BmiService service = new BmiService();
        int weight = 85;
        int height = 2;
        int height2 = information.option(height);
        int bmi = service.calculate(weight, height2);
        System.out.println("Индекс массы тела: " + bmi);
    }
}