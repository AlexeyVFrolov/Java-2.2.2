import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BMIService service = new BMIService();
        System.out.print("Please, enter your height in centimeters ");
        long height = (long) (in.nextDouble() * 10); // customer height, milimeters
        System.out.print("Please, enter your weight in kilograms ");
        long weight = (long) (in.nextDouble() * 1000); // customer weight, grams
        System.out.println(String.format("Your Body Mass Index: %s", service.calculate(height, weight)));
    }
}