import java.util.Scanner;

class PythagoreanTriplet
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        boolean answer = isPythagoreanTriplet(num1, num2, num3);

        System.out.println("Is Pythagorean Triplet = " + answer);
    }

    static boolean isPythagoreanTriplet(int num1, int num2, int num3)
    {
        int a = (num1 * num1) + (num2 * num2);

        int b = num3 * num3;

        return a == b;
    }
}