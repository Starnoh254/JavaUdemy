package lessons;

// final keyword in Java
final class A{
    final void show(){
        System.out.println("in A");
    }


}


// class B extends A{ // compile time error

// }


// class B extends A {
    
//     // void show(){ // compile time error
//     //     System.out.println("in B");
//     // }
// }


public class LessonG {
    public static void main(String[] args){
        final int x = 26;
        // x = 34; // this is wrong , causes compile-time error , it wont compile
    }


}
