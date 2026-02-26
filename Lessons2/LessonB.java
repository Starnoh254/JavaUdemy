package Lessons2;

enum Laptop {

    MacBook(2000) , Dell(1500) , Samsung(1800) , Lenovo(1000) , HP(900);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class LessonB {
    public static void main(String[] args){

        // Laptop lap = Laptop.MacBook;

        // System.out.println(lap.getPrice());

        for(Laptop laptop : Laptop.values()){

            System.out.println(laptop + " " + laptop.getPrice());

        }

    }
}
