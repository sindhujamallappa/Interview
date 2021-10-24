//Creating a dynamic that accepts input from user
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in); //Declaring and creating a scanner object, use the sc variable in any method in the class. To create a Scanner object, you use the new keyword followed by a call to the Scanner class constructor.
        System.out.println("Enter the number of Elements you want to store: ");
    
        n=sc.nextInt(); //used to scan the next token of the input as an int.
        int[]array=new int[10]; //int[] is an array of primitive int values
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

