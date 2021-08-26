import java.util.Scanner;

class Factors {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = in.nextInt();

        System.out.print("\nFactors of " + num + " are :\n");

        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                System.out.println(i);
            }
        }

    }
}