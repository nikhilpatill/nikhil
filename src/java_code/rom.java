package java_code;

public class rom {

    public static void main(String[] args) {
        int a[] = {10, 30,40,60};
        int low = 0;
        int high = a.length - 1;
        int mid = (low + high) / 2;
        int ser = 40;

        while(low<=high)
        {
            if (a[mid]==ser)
            {
                System.out.println(mid);
                break;
            }
            else if(a[mid]<ser)
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
            System.out.println("not found");
        }
}
}


