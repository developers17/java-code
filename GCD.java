import java.util.Random;
public class GCD{
	public static void main(String args[]){	
	Random rm = new Random();
	int m =rm.nextInt(100);
	int n =rm.nextInt(100);
	int c;
	System.out.println("m="+m);
	System.out.println("n="+n);
	c=gcd(m,n);
	System.out.println("最大公约数为"+c);
	}
	public static int gcd(int m, int n)
	{ 
	while (true)
	{ 
	if ((m = m % n) == 0)   
	return n;
	if ((n = n % m) == 0)
	return m;
	}
	}
}
