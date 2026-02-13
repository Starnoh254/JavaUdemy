package lessons;

public class LessonN {
    public static void main(String[] args){
        int x = 800;
        int y = 7;
        int z = 46;

        if(x > y){
            if(x > z){
                System.out.println(x);
            }
            else{
                System.out.println(z);
            }
        }
        else {
            if(y > z){
                System.out.println(y);
            }
            else{
                System.out.println(z);
            }
        }
    }
}
