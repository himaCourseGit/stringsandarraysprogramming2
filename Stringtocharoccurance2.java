class Stringtocharoccurance2 
{
	public static void main(String[] args) 
	{

		String s="aaAAcccc";
		char[] c=s.toCharArray();
		for (int i=0;i<c.length ;i++)
		{
			int count=0;
			for (int j=0;j<c.length ;j++ )
			{
				if(c[i]==c[j])
				{
					count++;
				}
			}
			int isPresent=0;
			for(int k=i;k>=0;k--)
			{
				if(c[i]==c[k])

			{
				isPresent++;
			}
		}
		if(isPresent==1)
		{
			System.out.print(count+""+c[i]);
			
		}
	}
	}
}