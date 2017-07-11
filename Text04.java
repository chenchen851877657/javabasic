package shangkelianxi20170711;

import java.util.Scanner;

public class Text04 {

	public static void main(String[] args) {
		/**
		 * 计算用户输入的日期离1900年1月1日相距多少天（注意年份月份）
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		System.out.println("请输入天数：");
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
				System.out.println("您输入的月份不合法！");
				break;
			}
			index++;
		} while (index < month);
		days += day;
		System.out.println("输入的日期离1900年1月1日相差" + days + "天！");
	}
}
