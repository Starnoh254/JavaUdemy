package Lessons2;

class Geeks {
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public synchronized int getCount(){
        return count;
    }

}

public class LessonU {
    public static void main(String[] args) throws InterruptedException{
        // Race condition example

        Geeks counter = new Geeks();

        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 1000; i++){
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());
    }
}
