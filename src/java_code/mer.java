package java_code;

public class mer {
    void divid(int a[],int low ,int mid ,int high )
    {
        int i=low;
        int j=mid+1;
        int k=low;
        int b[]=new int[100];

        while(i<=mid && j<=high)
        {
             if (a[i]<mid)
             {
                     b[k]=a[i];
                     i++;
                     k++;
             }

            else
            {
                b[k]=a[j];
                j++;
                k++;
            }

            while(i<=mid)
            {
                      b[k]=a[i];
                      i++;
                      k++;
            }

            while(j<=mid)
            {
                   b[k]=a[j];
                   k++;
                   j++;

            }




        }

    }
}
