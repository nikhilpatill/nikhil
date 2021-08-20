package exception;

public class exception {

    public static void main(String[] args) {

        try{
            int num=50/0;
            System.out.println(num);
        }

        catch (ArithmeticException e)
        {
            System.out.println(e);

        }

    }


}
