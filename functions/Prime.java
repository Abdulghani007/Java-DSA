import java.util.Scanner;

class Prime{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = in.nextInt();

        boolean result = isPrime(num);

        System.out.println("Is Prime = " + result);

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