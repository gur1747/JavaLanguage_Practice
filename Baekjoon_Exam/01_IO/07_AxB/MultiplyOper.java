import java.util.Scanner;

public class MultiplyOper {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int A, B;
		
		A = scan.nextInt();
		B = scan.nextInt();
		
		System.out.println(A * B);
		
		scan.close();
	}
}
