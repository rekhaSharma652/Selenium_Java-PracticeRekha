
public class fibonacciseries {
	public static void main(String args[])
	{
		int na,nb,nc;
		int i=0;
		na=0;
		nb=1;
		System.out.print(na+" "+nb);
		while(i<10)
		{
			nc=na+nb;
			na=nb;
			nb=nc;
			System.out.print(" "+nc);
			i++;
		}
	}

}
