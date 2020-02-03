package Pattern;

import java.util.Scanner;

public class N
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        for (int i=0; i<n;i++)
        {
            for (int j=0; j<n;j++)
            {
                if(j==0 || i==j  || j==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


    }

}
