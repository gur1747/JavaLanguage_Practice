import java.util.Scanner;

public class DivideOper {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double A, B;
		double result;
		
		A = scan.nextDouble();
		B = scan.nextDouble();
		
		result = A / B;
		
		System.out.printf("%.7lf\n", result);
		
		scan.close();
	}
}
//���ؿ��� Ʋ�Ƚ��ϴ� �� ���� -> double, %.xlf���°� ã�ƺ���
