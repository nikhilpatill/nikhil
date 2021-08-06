package java_code;

public class classs {
    int num;
    String name;

    void dis(int num, String name)
    {
        System.out.println(" enter the number "+num);
        System.out.println(" enter the name "+ name);

    }

    public static void main(String[] args) {
        classs s=new classs();
        s.dis(101,"nikhil");
        s.dis(102,"pooja");
        s.dis(103,"ram");

    }
}
