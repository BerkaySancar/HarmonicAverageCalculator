public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};   // You can change the numbers if you want 

        double hSeries = 0.0;

        for (int i = 0; i < numbers.length; i++) {
                   hSeries += 1.0 / numbers[i];
        }
        double average = numbers.length / hSeries;
        System.out.println(average);
    }
}
