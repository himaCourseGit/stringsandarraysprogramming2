class Fibonaccins 
{
	public void fibonacci()
	{
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.println(n1+" ");
		System.out.println(n2+" ");
		for(int i=3;i<=10;i++)
		{
			n3=n1+n2;
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Fibonaccins f=new Fibonaccins();
		f.fibonacci();
		System.out.println("main ends");
	}
}
