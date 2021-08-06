package java_inharitance;

public class s_parent {
    // inharitance is one class  aquaire  to anather class . by ise is relation
    // type off the  inharitance :
    // 1]-> single 2]-> multilevel, 3]-> hirarchical
    //  reuse the code : feature inharitance
    //inharitance use to child class access parent property by using extends keyword
    // can not inharite constuctor  :

    void dis() {
        System.out.println("parent class  ");
    }

    s_parent()
    {
        System.out.println(" hii child i am constuctor plze access me ");
    }

}

       class child extends s_parent{

      void dis2()
    {
        System.out.println(" hii child plese show me your parent data ");
        super.dis();

    }

          public void main(String[] args) {

              child s=new child ();



          }
      }



