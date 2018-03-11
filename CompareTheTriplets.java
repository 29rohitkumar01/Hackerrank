import java.io.*;
import java.util.*;


public class CompareTheTriplets {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int a[]=new int[6];
       int sum1=0,sum2=0;
       for(int i=0;i<a.length;i++)
           a[i]=sc.nextInt();
       for(int i=0;i<=2;i++)
       {
           if(a[i]>a[i+3])
               sum1++;
           else if(a[i]<a[i+3])
               sum2++;
       }
       System.out.println(sum1+" "+sum2);
    }
}


