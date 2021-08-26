import java.util.Scanner;

class Operation {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int num1 = in.nextInt();

        System.out.print("\nEnter Number 2: ");
        int num2 = in.nextInt();

        System.out.print("\nEnter Operator: ");
        char op = in.next().charAt(0);

        if(op == '+')
        {
            System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
        }
        else if(op == '-')
        {
            System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        else if(op == '*')
        {
            System.out.print(num1 + " * " + num2 + " = " + (num1 * num2));
        }
        else if(op == '/')
        {
            System.out.print(num1 + " / " + num2 + " = " + (num1 / num2));
        }
        else
        {
            System.out.print("Invalid Operator!!");
        }

    }
}