package java_inharitance;

public class harar_parent {
    void dis()
    {
        System.out.print(" single parent ");
    }
}
class h_child1 extends  harar_parent {

    void show()
    {
        System.out.print(" child1");
    }

}


class h_child2 extends harar_parent {

    void show2()
    {
        System.out.print("child2 ");
    }

    public static void main(String[] args) {
        h_child2 s2=new h_child2();
        s2.show2();
        s2.dis();// muktiple child access one parent property
        h_child1 s1=new h_child1();
        s1.show();
        s1.dis();
    }
}
