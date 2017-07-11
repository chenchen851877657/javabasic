package shangkelianxi20170711;

public class Text03 {

	public static void main(String[] args) {
		double ply = 0.00008;
		int index = 0;
		while (ply <= 8848.13) {
			ply = ply * 2;
			index++;
		}
		System.out.println("在第" + index + "次折叠后，到达" + ply + "米的高度！");

		ply = 0.00008;
		index = 0;
		do {
			ply = ply * 2;
			index++;
		} while (ply <= 8848.13);
		System.out.println("在第" + index + "次折叠后，到达" + ply + "米的高度！");
	}
}
