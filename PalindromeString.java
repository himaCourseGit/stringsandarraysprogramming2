import java.util.Scanner;
class PalindromeString  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		if(rev.equals(s))
		{
			System.out.println("the given String is palindrome");
		}
		else
		{
			System.out.println("the given String is not a palindrome");
		}

	}
}
