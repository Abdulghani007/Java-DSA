import java.util.Scanner;

class AreaOfCircle{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");

        double radius = in.nextDouble();

        double pie = 3.142;

        double area = pie * radius * radius; 

        System.out.println("\nArea of circle with radius " + radius + " = " + area);
    }
}