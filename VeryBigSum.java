//A very Big sum (warmup section)

import java.util.*;
import java.lang.*;

public class VeryBigSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        long sum=0;
        for(int i=0;i<n;i++)
        { a[i]=sc.nextLong();
          sum+=a[i];
        }
        System.out.println(sum);

    }

}
