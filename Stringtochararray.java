class Stringtochararray
{
	public static void main(String[] args) 
	{
		String s="Hello";
			char[] c=s.toCharArray();
          
		System.out.println("character array elements are:");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}

	}
}
