import java.util.Scanner;
class Touppercasetolowercase
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.next();
		System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
		String uppercase=s.toUpperCase();
		System.out.println(uppercase);
		String lowerCase=s.toLowerCase();
		System.out.println(lowerCase);
	}
}
