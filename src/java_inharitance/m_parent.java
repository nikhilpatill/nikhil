package java_inharitance;

public class m_parent {
    void parentt() {
        System.out.println(" hello i am parent off my son ");
    }
}

    class child1 extends m_parent {

        void show() {
            System.out.println(" hii i am son i will achive parents property ");
        }
    }

    class subchild extends child1 {

        void sub() {
            System.out.println(" hii i subchil off child  ");
        }

        public static void main(String[] args) {
            subchild s = new subchild();
            s.sub();
            s.show();
            s.parentt();


        }
    }

