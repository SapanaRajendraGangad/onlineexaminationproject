package collection;
import java.util.*;
public class TranseposeMatrix
{
public static void main(String x[], Object[][] transpose)
{
	Scanner sc=new Scanner(System.in);
System.out.println("enter the number of row");
int r=sc.nextInt();
System.out.println("enter the value of column");
int c=sc.nextInt();
int a[][]=new int[c][r];
System.out.println("enter the value of matrix");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
 a[i][j]=sc.nextInt();
}
}
for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
	{
		System.out.println(a[i][j]);
		if(j==c-1)
		{
			System.out.println("\n");
		}
}
}
int transpose1[][] = null;
for(int i=0;i<r;i++)
{
	for( int j=0;j<c;j++)
	{
		transpose1[j][i]=a[i][j];
	}
}
		System.out.println("\n transpose of matrix\n");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.println(transpose1[i][j]);
				if(j==r-1)
				{
					System.out.println("\n");
				}
			}

}
}
}