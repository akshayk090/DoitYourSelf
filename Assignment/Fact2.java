public class Fact2 {

    public static void main(String[] args) {
        int num = 6;
        long factorial = mNum(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long mNum(int num)
    {
        if (num >= 1)
            return num * mNum(num - 1);
        else
            return 1;
    }
}