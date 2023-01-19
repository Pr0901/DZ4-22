public class Main {
    public static void main(String[] args) {


        BmiService service = new BmiService();

        int weight = 85;
        int height = 2;


        int bmi = service.calculate(weight, height);

        System.out.println("Индекс массы тела: " + bmi);
    }
}