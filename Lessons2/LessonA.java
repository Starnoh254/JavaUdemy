package Lessons2;

enum Roles {
    SUPER_ADMIN ,
    ADMIN , 
    USER , 
    GUEST
}

public class LessonA {
    public static void main(String[] args){

        Roles role = Roles.USER;

        switch (role) {


            case SUPER_ADMIN:
                System.out.println("Hello Super Admin , Welcome to Linkarp");
                break;

            case ADMIN:
                System.out.println("Hello Admin , Welcome to Linkarp");
                break;


            case USER:
                System.out.println("Hello User , Welcome to Linkarp");
                break;

            case GUEST:
                System.out.println("Hello Guest , Welcome to Linkarp");
                break;
        
            default:
                System.out.println("No user specified");
                break;
        }

    }
}
