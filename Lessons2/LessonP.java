package Lessons2;

// Encapsulation in java 

class Person {
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if(age > 0 && age <= 120){
            this.age = age;
            return;
        }

        throw new RuntimeException("Invalid age entered");

    }

    public void setName(String name){
        this.name = name;
    }
}

public class LessonP {
    public static void main(String[] args) {
        Person starnoh = new Person();
        starnoh.setAge(220);
        starnoh.setName("Starnoh");

        System.out.println(starnoh.getAge());
        System.out.println(starnoh.getName());
        
    }
}
