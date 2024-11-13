package country;

import modifiers.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Circle();
        System.out.print("Radius : ");
      int radius = new Scanner(System.in).nextInt();

        // Айлананын аянтын эсептөө
        double area = Circle.area(radius);
        System.out.println("Айлананын аянты: " + area);

        // Айлананын узундугун эсептөө
        double circumference = Circle.circumference(radius);
        System.out.println("Айлананын узундугу: " + circumference);   
    }
}
