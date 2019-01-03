import java.util.Scanner;
public class Palindrome
{	
	public static void main(String args[])
	{	
		int i=0,l,k=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入字符串");
		String str1 = scan.nextLine();
		l=str1.length();
		if(l%2==0)//偶数
		{
			for(i=0;i<l/2;i++)
			{
				if(str1.charAt(i)!=str1.charAt(l-1-i))
					k++;
			}
		
		}
		if(l%2==1)//奇数
		{
			for(i=0;i<(l-1)/2;i++)
			{
				if(str1.charAt(i)!=str1.charAt(l-1-i))
					k++;
			}
		
		}
		if(k==0)
			System.out.println("是回文字符串");
		else
			System.out.println("不是回文字符串");
		
	}
}

