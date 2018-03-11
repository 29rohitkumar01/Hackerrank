import java.util.*;
import java.io.*;

public class DiagonalDifference {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int diagonal1sum=0,diagonal2sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                 a[i][j]=sc.nextInt();
                if(i==j)
                    diagonal1sum+=a[i][j];
                if(i+j==n-1)
                    diagonal2sum+=a[i][j];
            }
        }
        System.out.println(Math.abs(diagonal1sum-diagonal2sum));
    }
}
