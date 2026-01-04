// Count occurrences of a number 

public class CountCocurrance {
    public static int count(int ar[], int key, int i) {
        int count;
        
        if (i == ar.length) { // basse case
            return 0;
        }

        if (ar[i] == key) {
            count = 1;
        } else  {
            count = 0;
        }
        return count + count(ar, key, i + 1); 

    }

    public static void main(String[] args) {
        int[] ar = {1, 3, 5, 3, 3};

        System.out.println(count(ar, 3, 0));
    }
}

// main() == > 14
// sumAr (ar 0) == > 0 + 3 return to main ()
// sumAr (ar 1) == > 1 + 2 return to sumAr (ar 0)
// sumAr (ar 2) == > 0 + 2 return to sumAr (ar 1)
// sumAr (ar 3) == > 1 + 1 return to sumAr (ar 2)
// sumAr (ar 4) == > 1 + 0
// sumAr (ar 5) == > 0 return to sumAr (ar 3)