import java.util.Scanner;
class Booleanarray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		Boolean[] b=new Boolean[size];
		System.out.println("enter the array elements");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextBoolean();
		}
		System.out.println("array elements are:");
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
	}
}
