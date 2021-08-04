package java_code;

public class nik {

    int dis(int a[], int low, int high)
    {
        int pi=a[(low+high)/2];
         while(low<=high)
         {
             while(a[low]<pi)
             {
                 low++;
             }
             while (a[high]>pi)
             {
                 high--;
             }
             if (low<=high)
             {
                 int temp=a[low];
                 a[low]=a[high];
                 a[high]=temp;
                 low++;  // must be use low++;
                 high--; // must be use high++;
             }

         }
        return low;
    }

      void q_sort(int a[], int low, int high)
    {
        int pia=dis(a,low,high);

        if(low< pia-1)
        {
            q_sort(a,low,pia-1);
        }
        if(pia<high)
        {
            q_sort(a,pia,high);
        }

    }

     void print(int a[])
    {
        for(int s:a) {
            System.out.println(s);
        }

    }

    public static void main(String[] args) {
        int a[]={3,2,1,6,4};
        int n=a.length;
       nik s=new nik();
       s.q_sort(a,0,n-1);
       s.print(a);

    }
}


