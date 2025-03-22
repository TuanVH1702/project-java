package Array_mang;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] mang1 = { 1, 2, 3 };

		int[] mang1_a = mang1;
		mang1_a[0] = 100;

		int[] mang1_c = new int[mang1.length];
		System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
		mang1_c[0] = 90;
		System.out.println("Mảng 1_c: " + Arrays.toString(mang1_c));

		String[] mang_doi_tuong = {"TITV", ".vn"};
	}
}
