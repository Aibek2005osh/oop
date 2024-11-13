package task;

public class Triangle {
     double num1;
     double num2;
     double num3;

    public double area() {
        double s = (num1 + num2 + num3) / 2;
        return Math.sqrt(s * (s - num1) * (s - num2) * (s - num3));
    }



}
