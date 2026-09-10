import java.util.Scanner;

class BMICalculator {

    static String getStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter height in meters: ");
            double height = sc.nextDouble();

            System.out.print("Enter weight in kg: ");
            double weight = sc.nextDouble();

            double bmi = weight / (height * height);

            System.out.printf("Person %d | BMI: %.2f | Status: %s%n",
                    i, bmi, getStatus(bmi));
        }
    }
}
