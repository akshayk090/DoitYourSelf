import java.util.*;
class getelement{
	public static void main(String[] args)
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter array size");
	int x =sc.nextInt();
	int a[]=new int[x];
	int i,j,k;
	System.out.println("Enter array elements");
	for(i=0;i<x;i++)
	{
	a[i]=sc.nextInt();
	}
	for (i = 0; i < a.length; i++)
	{
      //System.out.print(c[i] + "  ");
	
	for (j = i + 1; j < a.length; j++)   
	{  
	int tmp = 0;  
	if (a[i] > a[j])   
	{  
	tmp = a[i];  
	a[i] = a[j];  
	a[j] = tmp;  
	}  
	} 
	System.out.print(a[i] + "  ");	
	}
	
	System.out.println("Enter max element no to diplay :");
	int n=sc.nextInt();
	k=x-n;
	i=k;
	//a[a-1];
		System.out.print(n+"th largest element is :"+a[k]);
	    
	}
	}