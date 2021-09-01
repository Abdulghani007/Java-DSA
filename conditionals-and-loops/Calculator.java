import java.util.Scanner;

class Calculator {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to our Calculator!!\n");

        while(true) {

            System.out.print("Enter the operator: ");

            char op = in.next().charAt(0);

            if ( op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {
                System.out.print("Enter the two numbers: "); 
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                
                int answer = 0;
                if (op == '+')
                {
                    answer = num1 + num2;
                }
                else if(op == '-')
                {
                    answer = num1 - num2;
                }
                else if(op == '*')
                {
                    answer = num1 * num2;
                }
                else if(op == '/')
                {
                    answer = num1 / num2;
                }
                else if(op == '%')
                {
                    answer = num1 % num2;
                }
                System.out.println("Answer = " + answer);
            }
            else if(op == 'x' || op == 'X')
            {
                break;
            }
            else {
                System.out.println("Invalid Operator!!");
            }
        }
    }
}