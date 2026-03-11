package Lessons2;

// TODO: Define PrinterTask class that implements Runnable
class PrinterTask implements Runnable{
    @Override
    public void run(){
        for(int i = 0 ; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + ": Running task " + i);
        }
    }
}

public class MyExercise {
    public static void main(String[] args) throws InterruptedException{
        // TODO: Create a single PrinterTask object
        PrinterTask printerTask = new PrinterTask();

        // TODO: Create two threads using the same task
        // Name them "Worker-1" and "Worker-2"
        Thread worker1 = new Thread(printerTask, "Worker-1");
        Thread worker2 = new Thread(printerTask, "Worker-2");

        // TODO: Start both threads
        worker1.start();
        worker2.start();


        // TODO: Use join() to wait for both threads to finish
        worker1.join();
        worker2.join();
    }
}
