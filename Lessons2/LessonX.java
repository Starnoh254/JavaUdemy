package Lessons2;

import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id , String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        return this.id - that.id;
    }

}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.id - o2.id;
    }
    
}


public class LessonX {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(4,"Sam"));
        students.add(new Student(2,"John"));
        students.add(new Student(3,"Kamau"));
        students.add(new Student(1,"Starnoh"));

        System.out.println("Before sorting");

        System.out.println(students);

        Comparator<Student> comp = (s1 ,s2) ->  s1.id - s2.id;


        System.out.println();
        System.out.println("After sorting");


        Collections.sort(students , new StudentComparator());
        for(Student student : students){
            System.out.println(student);
        }
        
    }
}
