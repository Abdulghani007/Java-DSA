import java.util.Scanner;

class SumOfNaturalN
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = in.nextInt();

        int answer = sum(n);

        System.out.println("Sum of N natural numbers = " + answer);
    }

    static int sum(int n)
    {
        return n*(n+1) / 2;
    }
}