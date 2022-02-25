import java.util.*;
class mergearray{
	public static void main(String[] args)
	{
//Scanner sc = new Scanner(System.i);
	int i,j;
	int a[] = {47,504,76,62};
	int b[] = {33,53,22};
	int c[]= new [6];
	for(i=0;i<a.length;i++)
	c[i]=a[i];
	for(i=0,j=a.length;i<b.length && j<c.length;i++,j++)
	c[j]=b[i];

	System.out.println("merge array elements are"+c[j]);