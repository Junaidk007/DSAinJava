// Find sum of array elements

public class SumArr {

    public static int sumArr(int[] ar, int i) {
        if (i == ar.length) {
            return 0;
        }

        return ar[i] + sumArr(ar, i + 1);
    }
    public static void main(String[] args) {
        int[] ar = {1, 2, 5, 6};

        System.out.println(sumArr(ar, 0));
    }
}
// main() == > 14
// sumAr (ar 0) == > 1 + 13 return to main ()
// sumAr (ar 1) == > 2 + 11 return to sumAr (ar 0)
// sumAr (ar 2) == > 5 + 6 return to sumAr (ar 1)
// sumAr (ar 3) == > 6 + 0 return to sumAr (ar 2)
// sumAr (ar 4) == > 0 return to sumAr (ar 3)
