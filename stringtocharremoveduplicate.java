import java.util.Scanner;
class stringtocharremoveduplicate 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String size");
		int size=sc.nextInt();
		char[] a=new char[size];
		System.out.println("enter the String elements:");


		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next().charAt(0);
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
		char[] b=new char[size2];
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
		System.out.println("after removing the duplicate elements from the given String:");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}
}
