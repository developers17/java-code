import java.util.Scanner;
public class Examination{
	public static void main(String args[]){
		int a;
		int b;
		System.out.println("������ƽʱ�ɼ���");
		Scanner chengji = new Scanner(System.in);
		a = chengji.nextInt();
		System.out.println("��������ڴ���: ");
		Scanner chuqin = new Scanner(System.in);
		b = chuqin.nextInt();
		if(b<9||a<60){
			System.out.println("û����ĩ�����ʸ�");	
		}
		else{
			System.out.println("����ĩ�����ʸ�");
		}
	}
}

