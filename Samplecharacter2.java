import java.util.Scanner;
class Samplecharacter2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		char[] c=new char[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<c.length;i++)
		{
			c[i]=sc.next().charAt(0);
		}
		System.out.println("Array elements are:");
		for(int j=0;j<c.length;j++)
		{
			System.out.println(c[j]);
		}
	}
}