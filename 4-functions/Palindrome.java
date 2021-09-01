import java.util.Scanner;

class Palindrome
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        // int num = Integer.parseInt(args[0]);
        int num = in.nextInt();

        boolean answer = isPalindrome(num);

        System.out.println("Is Palindrome = " + answer);
    }

    static boolean isPalindrome(int num)
    {
        int reverse = 0;
        int numCopy = num;

        while(numCopy != 0)
        {
            int digit = numCopy % 10;

            reverse = reverse * 10 + digit;

            numCopy /= 10;
        }

        return reverse == num;
    }
}