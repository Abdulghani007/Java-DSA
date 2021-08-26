import java.util.Scanner;

class LargestOfAllTillZero {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int largest = 0;

        while(true)
        {
            System.out.print("Enter number: ");
            int num = in.nextInt();

            if(num == 0)
                break;
                
            if(largest == 0)
                largest = num;
            else if(num > largest)
                largest = num;
        }
           
        System.out.print("Largest = " + largest);

    }
}