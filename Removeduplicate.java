import java.util.Scanner;
class Removeduplicate
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size1=sc.nextInt();
		int[] a=new int[size1];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int totalCount=0;
		for(int i=0;i<a.length;i++)
		{
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
				totalCount++;
			}
		}
		int size2=totalCount;
		int[] b=new int[size2];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
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
				b[index]=a[i];
				index++;
			}
		}
		System.out.println("after removing the duplicate elements from the given array:");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}
}
