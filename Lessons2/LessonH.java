package Lessons2;

class InvalidNameException extends Exception {
    public InvalidNameException(String message){
        super(message);
    }
}

public class LessonH {
    public static void main(String[] args) throws InvalidNameException{

        String name = "Starnoh";

        if(!name.equals("Stan")){
            throw new InvalidNameException("The name is not Starnoh");
        }

        System.out.println("The name is definitley Starnoh");
        
    }
}
