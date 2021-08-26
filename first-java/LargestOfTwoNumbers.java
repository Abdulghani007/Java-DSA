import java.util.Scanner;

class LargestOfTwoNumbers {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int num1 = in.nextInt();

        System.out.print("\nEnter Number 2: ");
        int num2 = in.nextInt();

        if(num1 > num2)
        {
            System.out.println(num1 + " is largest!");
        }
        else if(num2 > num1)
        {
            System.out.println(num2 + " is largest!");
        }
        else
        {
            System.out.println("Both numbers are equal!");
        }

    }
}