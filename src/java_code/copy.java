package java_code;

public class copy {
    void dis(int a[], int low, int mid, int high)
    {
        int i=low;
        int j=mid+1;
        int k=high;

        int b[]=new int[100] ;

        while(i<=mid && j<=high)
        {
                if(a[i]<mid)
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
                           b[k] =a[i];
                           j++;
                           k++;
                }

        }
        for(i=low;i<=high;i++)
        {
            a[i]=b[i];
        }

    }

    void m_sort(int a[],int low ,int high)
    {
        int mid;
        if(low<high)
        {
            mid=(low+high)/2;
            m_sort(a,low,mid);
            m_sort(a,mid+1,high);
            dis(a,low,mid,high);

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

        int a[]={50,30,40,20,10};
        int n=a.length;
        copy s=new copy();

        s.m_sort(a,0,n-1);
        s.print(a);
    }

}
