package task;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.num1 = 7;
        triangle.num2 = 6;
        triangle.num3 = 9;

        System.out.printf("аянты : %.2f",triangle.area());
    }

}
