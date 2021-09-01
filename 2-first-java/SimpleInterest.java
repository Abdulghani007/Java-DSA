import java.util.Scanner;

class SimpleInterest {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Principle Amount: ");
        int P = in.nextInt();

        System.out.print("\nEnter Time: ");
        int T = in.nextInt();

        System.out.print("\nEnter Rate: ");
        int R = in.nextInt();

        System.out.print("\nSimple Interest = ");

        int SI =  (P*T*R) / 100;

        System.out.print(SI + "\n");

    }
}