package XuLiChuoi;

import java.util.Scanner;

public class StringClass {
/**
 * @param args
 */
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Moi ban nhap vao chuoi");
	String t = scanner.nextLine();
	// Su dung phuong thuc Length lay do dai chuoi
	System.out.println(t.length());
	int dodai = t.length();
	// ham charAt lay ra mot ki tu chuoi
	for(int i = 0; i < dodai; i++) {
		System.out.println("Do dai "+i+"la "+ t.charAt(i));
	}
	//Hàm getchars(Vị trí bắt đầu , vị trí kết thúc, mảng lưu dữ liệu, vị trí bắt đầu lưu mảng)
	char [] arrayChar = new char[100];
	t.getChars(1, 7, arrayChar, 0);
	for(int i =0; i<arrayChar.length;i++) {
		System.out.println("Giá trị của mảng "+i+ "Là: "+arrayChar[i]);
	}
	// Hàm getBytes => lấy ra giá trị của các ký tự
	byte [] arrayBytes = t.getBytes();
	for (byte b : arrayBytes) {
		System.out.println(b);
	}
	
	
}
}
