import java.util.Scanner;

class SumOfAllTillZero {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int sum = 0;

        while(true)
        {
            System.out.print("Enter number: ");
            int num = in.nextInt();

            if(num == 0)
                break;
            
            sum += num;
        }
           
        System.out.print("Sum = " + sum);

    }
}