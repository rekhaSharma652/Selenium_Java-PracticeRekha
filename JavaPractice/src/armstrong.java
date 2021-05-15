
public class armstrong {

	public static void main(String args[])
	{
		int temp = 0;
		int actual;
		int r;
		int n=153;
		actual=n;
		while(n > 0)
		{
			r=n%10;
			temp=(temp*10)+r;
			System.out.println(temp);

			n=n/10;
		}
		if(temp == actual)
		{
			System.out.println("this is armstrong number "+temp);
		}
		else
		{
			System.out.println("this is not palindrome number");
		}


	}
}
