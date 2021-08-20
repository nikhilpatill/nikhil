package exception;

public class Indexoutoffbound_exception extends Throwable {
    public static void main(String[] args) {

            try {
                int a[] = {10, 20, 30};
                System.out.println(a[10]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e);
            }
            }

    }



