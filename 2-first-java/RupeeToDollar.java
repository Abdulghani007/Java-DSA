import java.util.Scanner;

class RupeeToDollar {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter currency in rupee : ");
        double rupee = in.nextDouble();

        double dollar = rupee / 74;

        System.out.print(rupee + " Rupee = $" + dollar);
        
    }
}