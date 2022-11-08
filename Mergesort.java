public class Mergesort {
    public static void main(String[] args) {

        int ar1[] = { 3, 5, 9, 13, 35 };
        int ar2[] = { 1, 6, 8 };

        int res[] = new int[ar1.length + ar2.length];
        int i = 0, j = 0, k = 0;
        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] < ar2[j]) {
                res[k++] = ar1[i++];
            } else {
                res[k++] = ar2[j++];
            }
        }
        while (i < ar1.length) {
            res[k++] = ar1[i++];
        }
        while (j < ar2.length) {
            res[k++] = ar2[j++];
        }
        for (i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
