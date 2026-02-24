package lessons;

public class LessonY {
    public static void main(String[] args) {

        int nums[] = new int[5];
        String str = null;

        try {
            int s = 10 / 2;
            System.out.println(str.length());
            System.out.println(s);
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit");
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }

        System.out.println("Bye");

    }
}
