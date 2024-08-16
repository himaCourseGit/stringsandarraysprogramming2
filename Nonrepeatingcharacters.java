class Nonrepeatingcharacters 
{
	public static void main(String[] args) 
	{
		String s="hello";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			for(int j=0;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
				}
			}
			if(count!=1)
			{
				System.out.println("non repeating elements are:"+c[i]);
			}
		}
	}
}
