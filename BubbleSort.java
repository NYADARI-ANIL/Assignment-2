
public class BubbleSort {

	public static void main(String[] args) {

		int[] a = { 8, 3, 5, 4, 1, 7, 2 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length - i; j++) {

				if (a[j] < a[j - 1]) {
					int l = a[j];
					a[j] = a[j - 1];
					a[j - 1] = l;

				}
			}
		}

		for (int el : a) {
			System.out.print(el + " ");
		}

	}

}
