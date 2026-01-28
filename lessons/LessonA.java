package lessons;
public class LessonA {

    public static void main(String[] args) {
        // anonymous object
        new Student("Starnoh John", "BSSEC01/1756/2022", 22).printDetails();
    }
}


class Student {

    String name;
    String admission;
    int age;


    Student (String name , String admission , int age) {
        this.name = name;
        this.admission = admission;
        this.age = age;

    }

    public void printDetails(){
        System.out.println("Name : " + this.name + " Admission No : " + this.admission + " of age : " + this.age);
    }
}
