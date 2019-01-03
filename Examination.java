import java.util.Scanner;
public class Examination{
	public static void main(String args[]){
		int a;
		int b;
		System.out.println("请输入平时成绩：");
		Scanner chengji = new Scanner(System.in);
		a = chengji.nextInt();
		System.out.println("请输入出勤次数: ");
		Scanner chuqin = new Scanner(System.in);
		b = chuqin.nextInt();
		if(b<9||a<60){
			System.out.println("没有期末考试资格");	
		}
		else{
			System.out.println("有期末考试资格");
		}
	}
}

