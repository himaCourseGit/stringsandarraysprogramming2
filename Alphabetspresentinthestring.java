import java.util.Scanner;
class Alphabetspresentinthestring 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			if(Alphabetspresentinthestring.isAlaphabetic(s.charAt(i)))
			{
				System.out.println(s.charAt(i));

			}}
         
		 
	}
}
