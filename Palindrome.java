import java.util.Scanner;
public class Palindrome
{	
	public static void main(String args[])
	{	
		int i=0,l,k=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("�������ַ���");
		String str1 = scan.nextLine();
		l=str1.length();
		if(l%2==0)//ż��
		{
			for(i=0;i<l/2;i++)
			{
				if(str1.charAt(i)!=str1.charAt(l-1-i))
					k++;
			}
		
		}
		if(l%2==1)//����
		{
			for(i=0;i<(l-1)/2;i++)
			{
				if(str1.charAt(i)!=str1.charAt(l-1-i))
					k++;
			}
		
		}
		if(k==0)
			System.out.println("�ǻ����ַ���");
		else
			System.out.println("���ǻ����ַ���");
		
	}
}

