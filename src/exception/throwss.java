package exception;

import java.io.IOException;

public class throwss {

    void dis() throws IOException   // throws keyword declare only check exception
    {
        try{
            int num=5/0;
            System.out.println(num);

            int a[]={1,2,3};
            System.out.println(a[5]);

        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e )
        {
            System.out.println(e);
        }


    }

    public static void main(String[] args) throws IOException {
        throwss s=new throwss();
        s.dis();
    }
}
