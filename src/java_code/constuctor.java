package java_code;

public class constuctor {
    // constuctor is specil function which is use to create instance off class
    // constuctor does not return any value
    // constuctor can not overried because does not return anu value .
    // constuctor can not use in interface
    // constuctor can not abstract ,final :
    // constuctor didvid two two part 1]-> default constuctor
    //                                2]-> parametrise constuctor
    //  default contructor use to print default value off the object :
    //  parametrize constuctor use to provided different value off an object

    constuctor ()
    {
        System.out.println(" nikhil ganesh aptil");
    }

    constuctor (int num, String name )
    {
        System.out.println(num);
        System.out.println(name);

    }

    public static void main(String[] args) {
        constuctor s=new constuctor();
        constuctor s1=new constuctor(101,"nikhil");

    }

}
