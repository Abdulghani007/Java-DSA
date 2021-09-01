import java.util.Scanner;

class MarksGrades {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = in.nextInt();

        String answer = getGrade(marks);

        System.out.println("Grade = " + answer);
    }

    static String getGrade(int marks)
    {
        String answer = "";
        if(marks >= 91 && marks <= 100)
        {
            answer += "AA";
        }
        else if(marks >= 81 && marks <= 90)
        {
            answer += "AB";
        }
        else if(marks >= 71 && marks <= 80)
        {
            answer += "BB";
        }
        else if(marks >= 61 && marks <= 70)
        {
            answer += "BC";
        }
        else if(marks >= 51 && marks <= 60)
        {
            answer += "CD";
        }
        else if(marks >= 41 && marks <= 50)
        {
            answer += "DD";
        }
        else if(marks <= 40)
        {
            answer += "Fail";
        }
        return answer;
    }
}