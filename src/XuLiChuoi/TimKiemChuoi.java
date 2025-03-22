package XuLiChuoi;

public class TimKiemChuoi {
	public static void main(String[] args) {
		String s1 = "Xin chào mọi người,Xin Chào, Ô";
		String s2 = "Xin Chào";
		String s3 = "Xin Chào 123";
		char c1 = 'Ô';
		// Hàm indexOf tìm vị trí
		System.out.println("Vị trí của S2 trong S1 là: " + s1.indexOf(s2));
		System.out.println("Vị trí của s3 trong S1 là: " + s1.indexOf(s3));
		// Sử dụng vị trí bắt đầu tìm kiếm indexOf
		System.out.println("Vị trí của S2 trong s1 là: " + s1.indexOf(s2, 3));
		// Tìm kiếm char
		System.out.println("Vị trí của c1 trong s1 là" + s1.indexOf(c1));
		System.out.println("Vị trí của c1 trong s2 là" + s2.indexOf(c1, 15));
		// Hàm lastIndexof => tìm kiếm từ phải sang trái
		System.out.println("Vị trí của s2 trong s1 (từ phải sang trái) là: " + s1.lastIndexOf(s2));

		// tenFile = "Bai tap.excel.lop12.xls';

	}
}
