package exception;

public class throww {
    public static void main(String[] args) {

        int age = -1;
        if (age!=0 && age<18) {
            throw new ArithmeticException(" it is not valid ");
        } else {
            System.out.println(" vote ");
        }

    }
}