package lessons;

class Message {
    public void printMessage(int message){
        System.out.println("Message primitive: " + message);
    }

    public void printMessage(Integer message) {
        System.out.println("Message object: " + message);
    }
}

public class Cat {
    public static void main(String[] args){
        Message ob = new Message();
        Integer arg = 5;

        ob.printMessage(arg);
    }
}
