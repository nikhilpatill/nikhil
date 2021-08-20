package exception;

public class Arithematic_exception {
    public static void main(String[] args) {

        try
        {
           int num=50/0;
           System.out.println(num);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
