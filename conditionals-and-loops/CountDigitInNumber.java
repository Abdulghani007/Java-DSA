import java.util.Scanner;

class CountDigitInNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = in.nextInt();

        System.out.print("\nEnter digit to count: ");
        int digit = in.nextInt();

        int count = 0;

        while(n != 0){
            int rem = n % 10;

            if (rem == digit)
                count++;

            n /= 10;    
        }

        System.out.print("\nAnswer = " + count);
    }
}