package lessons;

interface Animal {
    void sound();
}

public class LessonV {
    public static void main(String[] args){

        // Anonymous inner class 
        Animal dog = new Animal() {
            public void sound(){
                System.out.println("Bark");
            }
        };

        dog.sound();

    }
}
