public class Selectionsort {

    static void selectionsort(int[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = ar[i];
            ar[i] = ar[min_idx];
            ar[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] ar = { 4, 5, 2, 7, 6, 3, 1 };

        selectionsort(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
