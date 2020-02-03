package Pattern;

import java.util.Scanner;

public class V
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        int px =1;
        int py = n*2-1;

        for (int i=0; i<n;i++)
        {
            for (int j=0; j<n*2+1;j++)
            {
                if(j==px || j==py)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            px++;
            py--;
            System.out.println();
        }
    }


}
