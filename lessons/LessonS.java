package lessons;

public class LessonS {
    public static void main(String[] args){

        // for(int i = 0 ; i < 5 ; i++){
        //     System.out.println("Hi " + i);
        // }

        // System.out.println();

        // for(int i = 5 ; i > 0 ; i--){
        //     System.out.println("Hi " + i);
        // }

        for(int i = 1 ; i <= 7; i++){
            System.out.println(checkDay(i));
        }
    }

    static String checkDay(int n){
        switch (n) {
            case 1:

                return "Sunday";
                

            case 2:

                return "Monday";
                   

            case 3:

                return "Tuesday";
                

            case 4:

                return "Wednesday";
                

            case 5:

                return "Thursday";
                

            case 6:

                return "Friday";
                

            case 7:

                return "Saturday";
                
            default:
                return "Enter a valid number";
                
        }
    }
}
