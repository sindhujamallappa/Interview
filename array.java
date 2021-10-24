//Creating a dynamic that accepts input from user
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Elements you want to store: ");
    
        n=sc.nextInt();
        int[]array=new int[10];
        System.out.println("Enter the Elements: ");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Array Elements are: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
    }
}

