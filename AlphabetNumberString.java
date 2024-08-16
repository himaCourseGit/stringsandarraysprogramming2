class AlphabetNumberString 
{
	public static void main(String[] args) 
	{
		String s="Hi123Hello45";
		for (int i=0;i<s.length();i++ )
		{
			if (Character.isAlphabetic(s.charAt(i)))
			{
				System.out.println(s.charAt(i));
			}
		}
	}
}