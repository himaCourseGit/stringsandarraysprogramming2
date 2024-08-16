import java.util.Scanner;
class  Subsequence
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string size");
		int size1=sc.nextInt();
		int[] a=new int[size1];
		System.out.println("enter the first array elements");
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
		for (int i=0;i<c.length;i++ )
		{
			int count=0;
			for(int j=0;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
				}
			}
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
				System.out.println(c[i]+"="+count+"times");
			}
		}
	}
}

