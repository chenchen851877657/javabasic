package shangkelianxi20170711;

import java.util.Scanner;

public class Text05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����������");
		int num = sc.nextInt();
		while (num != 0) {
			System.out.print(num % 10);
			num /= 10;
		}

		// do-whileд��
		System.out.println("������һ����������");
		int num2 = sc.nextInt();
		do {
			if (num2 == 0) {
				break;
			}
			System.out.print(num2 % 10);
			num2 /= 10;
		} while (num2 != 0);
	}
}
