import java.util.Scanner;
class Stringarraysample 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		String[] s=new String[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.next();
		}
		System.out.println("array elements are:");
		for(int j=0;j<s.length;j++)
		{
			System.out.println(s[j]);
		}
	}
}