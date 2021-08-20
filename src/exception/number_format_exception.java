package exception;

public class number_format_exception {
    public static void main(String[] args) {

        try
        {
           String name="abc";
           int i=Integer.parseInt(name);
        }

        catch(NumberFormatException e)
        {
            System.out.println(e);

        }
    }
}
