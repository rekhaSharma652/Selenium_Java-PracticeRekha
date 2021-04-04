
public class Palindrome {

	public static void main(String args[])
	{
		int temp = 0;
		int actual;
		int r;
		int n=452514;
		actual=n;
		while(n > 0)
		{
			r=n%10;
			temp=(temp*10)+r;
			n=n/10;
		}
		if(temp == actual)
		{
			System.out.println("this is palindrome number");
		}
		else
		{
			System.out.println("this is not palindrome number");
		}


	}
}
