package java_code;

public class polymorphisms {
    // what is poly morphismn is single entity perform multiple task.
    // type compile time polymorphism
    // 2]-> runtime poly morphism
    // compalitime poly morphism means overloading := same function name different arguments know as overloadig
    // runtime polymorphism -> override{ same function name and same arguments declare parent as well as child class
    // static method is override :
    // constuctor can not override :
    // we can overload the main method :



    void dis(int num, String name )// overloading concept are be use there
    {
        System.out.println(" enter the number "+num);
        System.out.println(" enter the name"+ name);


    }

    void dis()   // overload function
    {
        System.out.println(" overloadd  hii i am defaut function ");
    }
}
