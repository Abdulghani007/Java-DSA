import java.util.Scanner;

class Vote {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = in.nextInt();

        String answer = isEligible(age);

        System.out.println("Is Eligible = " + answer);

    }

    static String isEligible(int age)
    {
        if(age >= 18)
        {
            return "Yes";
        }
        return "No";
    }
}