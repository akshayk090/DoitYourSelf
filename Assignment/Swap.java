import java.util.*;
public class Swap {
public static void main(String args[]){
int a = 5, b = 6;
System.out.print("Before swap:\na = " + a + "\nb = " + b);
a = a + b; //a becomes 11
b = a - b; //b becomes 5
a = a - b; //a becomes 6
System.out.print("\n\nAfter swap:\na = " + a + "\nb = " + b);
}
}