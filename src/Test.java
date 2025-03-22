
public class Test {
	public static void main(String[] args) {
		MayTinhBoTuiFX500 fx500 = new MayTinhBoTuiFX500();
		System.out.println("Gia trij 5+3 " + fx500.cong(5, 3));
		double[] arr = new double[] { 1, 2, 3, 4, 5 };
		SapXepChen sxchen = new SapXepChen();
		sxchen.sapXepTang(arr);
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
