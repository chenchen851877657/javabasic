package shangkelianxi20170711;

import java.util.Scanner;

public class Text04 {

	public static void main(String[] args) {
		/**
		 * �����û������������1900��1��1���������죨ע������·ݣ�
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = sc.nextInt();
		System.out.println("�������·ݣ�");
		int month = sc.nextInt();
		System.out.println("������������");
		int day = sc.nextInt();
		long days = 0;
		int index = 0;
		for (int i = 1900; i < year; i++) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				days += 366;
			} else {
				days += 365;
			}
		}
		do {
			switch (index) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: {
				days += 31;
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11: {
				days += 30;
				break;
			}
			case 2: {
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					days += 28;
				} else {
					days += 29;
				}
				break;
			}
			default:
				System.out.println("��������·ݲ��Ϸ���");
				break;
			}
			index++;
		} while (index < month);
		days += day;
		System.out.println("�����������1900��1��1�����" + days + "�죡");
	}
}
