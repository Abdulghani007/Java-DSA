import java.util.Scanner;

class Factorial
{
    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);

        System.out.print("Enter N: ");
        int num = in.nextInt();

        int answer = factorial(num);

        System.out.println("Factorial of " + num + " = " + answer);
    }

    static int factorial(int num)
    {
        int result = 1;

        for (int i = 1; i <= num; i++)
        {
            result *= i;
        }

        return result;
    }
}