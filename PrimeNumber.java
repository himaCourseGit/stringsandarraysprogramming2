class PrimeNumber 
{
	public static void prime()
	{
		int n=5;
		boolean status=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0){
				status=false;
				break;
			}
		}
		if(status)
		{
			System.out.println("it is prime number");
		}
		else
		{
			System.out.println("is is not a prime number");
		}
	}
	public static void main(String[] args) 
	{
        System.out.println("Main starts");
		PrimeNumber.prime();
		System.out.println("Main ends");
	}
}
