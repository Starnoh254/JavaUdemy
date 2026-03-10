package Lessons2;


// Thread class implementation 
class ThreadImpl extends Thread{

    @Override
    public void run(){
        System.out.println("Thread Class running");
    }
}

class RunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable Thread Running");
    }
    
}


public class LessonT {
    public static void main(String[] args) {

        ThreadImpl t1 = new ThreadImpl();
        t1.start();

        RunnableThread r = new RunnableThread();
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
