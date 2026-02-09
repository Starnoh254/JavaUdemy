package lessons;


// Type conversion , Type casting , type promotion 

class LessonK {
    public static void main(String args[]){
        int x = 10;
        double y = x; // automatic conversion 

        double d = 10.75; // explicit conversion
        int z = (int) d;

        byte a = 10;
        byte b = 20;

        byte c = (byte) (a + b);

        int q = 5;
        double k = 2.5;

        double results = q + k;

        System.out.println(results);

        System.out.println(c);



        System.out.println(z);

        System.out.println(y);



    }
}
