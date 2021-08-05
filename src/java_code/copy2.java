package java_code;

public class copy2 {
    int divid(int[] a, int low, int high)
    {
        int pivo=a[(low+high)/2];
        while(low<=high)
        {
               while(a[low]<pivo)
               {
                   low++;

               }
               while(a[high]>pivo)
               {
                   high--;
               }

               if(low<=high)
               {
                   int temp= a[low];
                   a[low]=a[high];
                   a[high]=temp;
                   low++;
                   high--;
               }

        }
        return low;
    }

    void q_sort(int a[], int low , int high)
    {
         int pi=divid(a,low,high);

         if(low<pi-1)
         {
             q_sort(a,low,pi-1);
         }

         if(pi< high)
         {
             q_sort(a,pi,high);

         }
    }

    void print(int a[])
    {
        for(int s:a)
        {
            System.out.println(s);
        }

    }

    public static void main(String[] args) {
        copy2 s=new copy2();

        int a[]={30,20,40,50};
        int n=a.length;
        s.q_sort(a,0,n-1);
        s.print(a);

    }

}
