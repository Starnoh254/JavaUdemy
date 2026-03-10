package Lessons2;

// Creating threads through extending a Thread class
// class MyThread extends Thread{
//     public void run(){
//         String str = "Thread Started Running...";
//         System.out.println(str);
//     }
// }

class MyThread implements Runnable {
    public void run(){
        String str = "Thread is Running Successfully";
        System.out.println(str);
    }
}

public class LessonS {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        Thread g1 = new Thread(t1);
        g1.start();
        
    }
}
