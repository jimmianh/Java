package session11;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTemprature {
    public static void main(String[] args) {

        System.out.println("How many day's temperatures ? ");
        Scanner scan = new Scanner(System.in);
        int numDays = scan.nextInt();
        int[] temperatures = new int[numDays];
        System.out.println("");

        int sum = 0;

        for (int i = 0; i < numDays; i++) {
            System.out.println("Day" + (i+1) + "'s high temp :");
            temperatures[i] = scan.nextInt();
            sum += temperatures[i];
            System.out.println("");
        }
        double averageTemperature = (double) sum / numDays;

        int count = 0;
        for (int i = 0;i < temperatures.length;i++){
            if (temperatures[i] >averageTemperature) {
                count++;
            }
        }

        System.out.println("Average = " + averageTemperature);
        System.out.println(count + "days above average");
    }
}
