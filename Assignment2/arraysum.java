import java.util.Scanner;
class arraysum{
		public static void main(String args[])
		{
			Scanner s1 = new Scanner(System.in);
			int a1[][]= new int[2][2];
			int sum[][]= new int[2][2];
			
			System.out.println("enter 1st array elements ");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
				a1[i][j]=s1.nextInt();
				}
			}
			int b1[][]= new int[2][2];
			System.out.println("enter 2nd array elements ");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
				b1[i][j]=s1.nextInt();
				}
			}
			System.out.println("------------");
			
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
				System.out.print("  "+a1[i][j]);
				}
				System.out.println("   ");
			}
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
				System.out.print("  "+b1[i][j]);
				}
				System.out.println("   ");
			}
			System.out.println("------------");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
				sum[i][j]=a1[i][j] + b1[i][j];
				System.out.print("  "+sum[i][j]);
				}
				System.out.println("   ");
			}
			//System.out.println("------------");
				
		}
	}