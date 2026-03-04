package Lessons2;

class InvalidNameException extends RuntimeException {
    public InvalidNameException(String message) {
        super(message);
    }
}

public class LessonH {
    public static void main(String[] args) {

        try {
            String name = "Starnggoh";

            if (!name.equals("Starnoh")) {
                throw new InvalidNameException("The name is not Starnoh");
            }

            System.out.println("The name is definitley Starnoh");
        } catch (InvalidNameException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

    }
}
