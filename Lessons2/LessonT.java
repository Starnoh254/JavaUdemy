package Lessons2;


// Thread class implementation 
class ThreadImpl extends Thread{

    @Override
    public void run(){
        System.out.println("Thread Class running");
    }
}

// class RunnableThread implements Runnable {

//     @Override
//     public void run() {
//         System.out.println("Runnable Thread Running");
//     }
    
// }


public class LessonT {
    public static void main(String[] args) {

        ThreadImpl t1 = new ThreadImpl();
        t1.start();

        // lets use lambda expressions

        Runnable r = () -> System.out.println("Runnable Thread Running");


        Thread t2 = new Thread(r);
        t2.start();

        try {

            t1.join();
            t2.join();

        } catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }
}
