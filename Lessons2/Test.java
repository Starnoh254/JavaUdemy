package Lessons2;

import java.util.Scanner;

// interface service {
//     void show();
// }

// class B implements service {

//     @Override
//     public void show() {
//         System.out.println("Important concept in java");
//     }
    
// }

public class Test {
    public static void main(String[] args){
        // System.out.println("You gave me " + args.length + " words");

        // for(String word : args){
        //     System.out.println("Word : " + word);
        // }
        Scanner scan = new Scanner(System.in);

        
        int age = scan.nextInt();

        if( age > 18){
            System.out.println("You are an adult");
        }
        else {
            System.out.println("You are a minor");
        }

        scan.close();
    }
}
