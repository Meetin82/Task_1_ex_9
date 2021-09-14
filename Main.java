package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        countNumbers();
    }
    public static void countNumbers() {

        System.out.print("Enter the first catheter: ");
        double a = readNumbers();

        System.out.print("Enter the first catheter: ");
        double b = readNumbers();

        double c = Math.sqrt(a * a + b * b);
        double s = 0.5 * a * b;
        double p = (a + b + c);
        System.out.println("The perimeter of this triangle: " + p);
        System.out.println("The area of this triangle: " + s);
    }
    public static double readNumbers() {
        Scanner scn = new Scanner(System.in);
        return scn.nextDouble();
    }
}

