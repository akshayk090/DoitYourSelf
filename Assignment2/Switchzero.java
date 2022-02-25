import java.io.*;
 
class Switchzero
{
    // Function which pushes all zeros to end of an array.
    static void Switchzero(int arr[], int n)
    {
        int count = 0;  
 
        
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
                                       // incremented
 
        while (count < n)
            arr[count++] = 0;
    }
 
    
    public static void main (String[] args)
    {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        Switchzero(arr, n);
        System.out.println("New Array : ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}