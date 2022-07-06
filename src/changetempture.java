import java.util.Scanner;

public class changetempture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do{
            System.out.println("menu");
            System.out.println("1. Fahrenheit to celsius");
            System.out.println("2. Celsius To Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter fahrenheit");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit To Celsius: " + fahrenheitToCelsius(fahrenheit));
                }
                case 2 -> {
                    System.out.println("Enter celsius");
                    celsius = sc.nextDouble();
                    System.out.println("Celsius To Fahrenheit : " + celsiusToFahrenheit(celsius));
                }
                case 0 -> System.exit(0);
            }
        } while (true);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0/9)*(fahrenheit-32);
        return celsius;
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0/5)*(celsius+32);
        return fahrenheit;


    }
}
