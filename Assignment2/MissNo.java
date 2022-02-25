import java.util.Arrays;
 
class MissNo
{
    // Find the missing number in a given array
    public static int getMissingNumber(int[] arr)
    {
        
        int n = arr.length;
 
        
        int m = n + 1;
 
      
        int total = m * (m + 1) / 2;
 
       
        int sum = Arrays.stream(arr).sum();
 
      
        return total - sum;
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
 
        System.out.println("The missing number is " + getMissingNumber(arr));
    }
}