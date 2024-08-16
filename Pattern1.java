class Pattern1
{
	public static void main(String[] args) 
	{
		int num=7;
		int space=0;
		int n=1;
		for(int i=1;i<=3;i++)
		{
			for(int a=1;a<=space;a++)
			{
				System.out.print(" "+" ");
			}
			for(int b=1;b<=num;b++)
			{
				System.out.print(1+" ");
			}
			System.out.println();
			space++;
			num=num-2;
			
		}
	}
}