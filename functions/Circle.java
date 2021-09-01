import java.util.Scanner;

class Circle {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = in.nextInt();

        double areaOfCircle = area(radius);

        double circumferenceOfCircle = circumference(radius);

        System.out.println("Area = " + areaOfCircle);

        System.out.println("Circumference = " + circumferenceOfCircle);
    }

    static double area(double radius)
    {
        double pie = 3.142;

        double areaOfCircle = pie * radius * radius;

        return areaOfCircle;
    }

    static double circumference(double radius)
    {
        double pie = 3.142;

        double circumferenceOfCircle = 2 * pie * radius;

        return circumferenceOfCircle;
    }
}