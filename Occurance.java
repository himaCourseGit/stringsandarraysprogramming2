import java.util.Scanner;
class Occurance 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter the array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
	         int count=0;
			 for(int j=0;j<a.length;j++)
			{
				 if (a[i]==a[j])
				 {
					 count++;
				 }
			}
			int isPresent=0;
			for(int k=i;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					isPresent++;
				}
			}
			if(isPresent==1)
			{
				System.out.println(a[i]+"="+count+"times");
			}
		}
	}
}
