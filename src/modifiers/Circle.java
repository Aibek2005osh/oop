package modifiers;

public class Circle {
    public static final double PI =Math.PI ;


    private double radius;
    public Circle (){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public static double area(double radius) {
        return PI * (radius * radius);
    }

    public static double circumference(double radius) {
        return PI * 2 * radius;
    }



}

