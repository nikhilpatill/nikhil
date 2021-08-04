package java_code;

public class quick {

    static int dis(int a[], int low, int high)
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

    static void q_sort(int a[], int low, int high)
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

    static void print(int a[],int n)
    {
        for(int i=0;i<n;i++) {
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args) {
        int a[]={30,20,40,20};
        int n=a.length;

        q_sort(a,0,n-1);
        print(a,n);

    }
}

