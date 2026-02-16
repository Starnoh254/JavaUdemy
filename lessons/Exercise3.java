package lessons;

public class Exercise3 {
    public static void main(String[] args){

                int score = 99;
                char grade;

                

                if (score >= 50)
                    System.out.println("Passed");

                else
                    System.out.println("Failed");

                

                if (score >= 90)
                    grade = 'A';

                else if (score >= 75)
                    grade = 'B';

                else if (score >= 60)
                    grade = 'C';

                else
                    grade = 'D';

                System.out.println("Grade: " + grade);



    }
}
