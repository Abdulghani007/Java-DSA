import java.util.Scanner;

class EvenOrOdd {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = in.nextInt();

        String answer = EvenOdd(num);

        System.out.println("Number is = " + answer);
    }

    static String EvenOdd(int num)
    {
        if(num % 2 == 0)
        {
            return "Even";
        }
        return "Odd";   
    }
}