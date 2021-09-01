import java.util.Scanner;

class PrimesInRange
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Range a and b: ");

        int a = in.nextInt();
        int b = in.nextInt();

        primesInRange(a, b);
    }

    static void primesInRange(int a, int b)
    {
        for(int i = a; i <= b; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }     
        }
    }

    static boolean isPrime(int num)
    {
        int i = 2;

        while(i * i <= num)
        {
            if(num % i == 0)
                return false;
            i++;
        }
        
        return true;
    }
}