package shangkelianxi20170711;

public class Text03 {

	public static void main(String[] args) {
		double ply = 0.00008;
		int index = 0;
		while (ply <= 8848.13) {
			ply = ply * 2;
			index++;
		}
		System.out.println("�ڵ�" + index + "���۵��󣬵���" + ply + "�׵ĸ߶ȣ�");

		ply = 0.00008;
		index = 0;
		do {
			ply = ply * 2;
			index++;
		} while (ply <= 8848.13);
		System.out.println("�ڵ�" + index + "���۵��󣬵���" + ply + "�׵ĸ߶ȣ�");
	}
}
