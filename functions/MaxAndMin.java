import java.util.Scanner;

class MaxAndMin {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int maximum = max(num1, num2, num3);

        int minimum = min(num1, num2, num3);

        System.out.println("Maximum between three = " + maximum);

        System.out.println("Minimum between three = " + minimum);        
    }

    static int max(int num1, int num2, int num3)
    {
        int max = num1;

        if(num2 > max)
        {
            max = num2;
        }

        if(num3 > max)
        {
            max = num3;
        }

        return max;
    }

    static int min(int num1, int num2, int num3)
    {
        int min = num1;

        if(num2 < min)
        {
            min = num2;
        }

        if(num3 < min)
        {
            min = num3;
        }

        return min;
    }
}