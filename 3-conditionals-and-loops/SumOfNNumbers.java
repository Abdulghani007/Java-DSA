import java.util.Scanner;

class SumOfNNumbers{
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter N: ");

        int n = in.nextInt();

        System.out.println("Enter " + n + " numbers: ");

        int sum  = 0;

        for (int i = 1; i <= n ; i++ )
        {
            int num = in.nextInt(); 
            sum += num;     
        }

        System.out.println("Sum  of N numbers is: " + sum);
    }
}