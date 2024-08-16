import java.util.Scanner;
class Isempty  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
        Boolean isempty=s.isEmpty();
		System.out.println(isempty);
	}
}
