import java.util.Scanner;
class Bubblesortdescending 
{
	public static void main(String[] args) 
	{
         Scanner sc=new  Scanner(System.in);
		System.out.println("enter the  array size");
		int size1=sc.nextInt();
		int[] a=new int[size1];
		System.out.println("enter the  array elements");
		for(int  i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Before sorting array elements are: ");
		for(int cycle=1;cycle<a.length;cycle++)
		{
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]<a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		System.out.println("Descending order of the elements are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}