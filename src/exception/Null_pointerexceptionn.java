package exception;

public class Null_pointerexceptionn {

    public static void main(String[] args) {


        try {
            String name = "null";
            System.out.println(name);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}