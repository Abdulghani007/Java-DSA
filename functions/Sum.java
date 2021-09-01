import java.util.Scanner;

class Sum{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int answer = sum(num1, num2);

        System.out.println("Sum = " + answer);
    
    }

    static int sum(int num1, int num2)
    {
        int answer = num1 + num2;

        return answer;
    }
}