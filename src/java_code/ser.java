package java_code;

public class ser {
    public static void main(String[] args) {
        int ser = 20;                    //    0     1      2
        int a[] = {10, 20, 30,};        // a { 10    20    30};
        int low = 0;                   //   low     mid     high
        int high = a.length - 1;
          int mid=(low+high)/2;

        while (low <= high) {

               if(a[mid]==ser)
               {
                   System.out.println(" found "+mid);
                   break;
               }
               else if (a[mid]<ser)
               {
                   low=mid+1;
               }
               else
               {
                   high=mid-1;
               }
            mid=(low+high)/2;

        }
        if(low>high)
        {
            System.out.println(" not found");
        }

    }
}
