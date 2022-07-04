import javax.swing.*;
import java.util.Scanner;

public class BMICalculator {
    private static int intWeight;
    private static double dHeight;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("The console program calculates your body mass index\n" +
                "Please answer the following questions to calculate your body mass index");

        System.out.print("Your weight(kg): ");
        String strWeight = reader.nextLine();
        try {
            intWeight = Integer.parseInt(strWeight);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number!");
            System.exit(-1);
        }

        System.out.print("Your height(cm): ");
        String strHeight = reader.nextLine();
        try {
            dHeight = Double.parseDouble(strHeight);
            dHeight /= 100; //  Conversion from centimeter to meter
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number!");
            System.exit(-1);
        }

        double dResult = intWeight / (dHeight * dHeight);
        if (dResult < 18.5) {
            System.out.println("Your body mass index is " + dResult + "\nYou are underweight. You should eat more :)");
        } else if (dResult < 24.9) {
            System.out.println("Your body mass index is " + dResult + "\nYou are normal weight. Keep up the good work :)");
        } else if (dResult < 29.9) {
            System.out.println("Your body mass index is " + dResult + "\nYou are overweight. Try to eat less ;)");
        } else {
            System.out.println("Your body mass index is " + dResult + "\nYou are at obesity level. Please get help from a medical institution to control your weight :(");
        }

    }
}
