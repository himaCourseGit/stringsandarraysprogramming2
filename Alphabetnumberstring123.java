import java.util.Scanner;
class Alphabetnumberstring123 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s="Hi123Hello45";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
              System.out.println(s.charAt(i));
			}
		}
	}
}
