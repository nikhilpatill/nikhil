package java_code;

public class bubble {
    void dis(int a[],int low,int mid, int high)
    {                 //     0   1   2  |    3    4
          int i,j,k;    //  [50, 40, 30,|   20,  10]
          i=low;      //   low      mid |  j+1  high
          j=mid+1;  //     i                j
          k=low;
          int b[]=new int[100];

          while(i<=mid && j<=high)
          {
                 if(a[i]< a[j])
                 {
                            b[k]=a[i];
                            i++;
                            k++;
                 }
                 else {
                     b[k] = a[j];
                     j++;
                     k++;
                 }

                 while(i<=mid)
                 {
                       b[k]=a[i];
                       i++;
                       k++;
                 }
                 while(j<=high)
                 {
                         b[k]=a[j];
                         j++;
                         k++;
                 }

                 for(i=low;i<=high;i++)
                 {
                                 a[i]=b[i];

                 }
          }

    }

    void q_sort(int a[],int low ,int high)
    {
        int mid;

        if(low<high)
        {
            mid=(low+high)/2;
            q_sort(a,low,mid);
            q_sort(a,mid+1,high);
            dis(a,low,mid,high);
        }

    }

    void print( int a[])
    {
        for(int s:a)
        {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        int a[]={50,40,30,20,10};
        int n=a.length;
         bubble s=new bubble();
         s.q_sort(a,0,n-1);
         s.print(a);
    }







}
