import java.util.Scanner;
class Mergeremoveduplicatereverse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the first array size");
		int size1=sc.nextInt();
		int[] a=new int[size1];
		System.out.println("enter the first array elements")\
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the second array size");
		int size2=sc.nextInt();
		int [] b=new int[size2];
		System.out.println("enter the second array elements:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		int size3=a.length+b.length;
		int[] c=new int[size3];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}int index=a.length;
		for (int i=0;i<b.length ;i++ )
		{
			c[index]=b[i];
			index++;
		}
		System.out.println("merged array elements are:");
		for(int i=0;i<c.length;i++)
		{
		System.out.println(c[i]);
		}
		
		int totalCount=0;
		for(int i=0;i<c.length;i++)
		{
			int isPresent=0;
			for(int k=i;k>=0;k--)
			{
				if(c[i]==c[k])
				{
					isPresent++;
				}
			}
			if(isPresent==1)
			{
				totalCount++;
			}
		}
		int size4=totalCount;
		int[] d=new int[size4];
		int index1=0;
		for(int i=0;i<c.length;i++)
		{
			int isPresent=0;
			for(int k=i;k>=0;k--)
			{
				if(c[i]==c[k])
				{
					isPresent++;
				}
			}
			if(isPresent==1)
			{
				d[index1]=c[i];
				index1++;
			}
		}
		System.out.println("after removing the duplicate elements from the given array:");
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		for (int i=d.length-1;i>=0;i-- )
		{
			System.out.println(d[i]);

		}
	}
}
