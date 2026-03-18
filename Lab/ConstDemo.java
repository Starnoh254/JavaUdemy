package Lab;

import java.util.*;

class Student {
    private String name;
    private int age;

    public Student(String name){
        this.name = name;
        this.age = 18;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    


}

public class ConstDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Starnoh" , "John" , "Kamau");

        List<Student> students = new ArrayList<>();

        // for(String name : names){
        //     students.add(new Student(name));
        // }

        // students = names.stream()
        //     .map(name -> new Student(name))
        //     .toList();


        students = names.stream()
            .map(Student::new)
            .toList();

        System.out.println(students);
        
    }
}
