public class Main {
    static void printSubArray(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("[ ");
                for(int st = i; st <= j; st++) {
                    System.out.print(arr[st] + ", ");
                }
                System.out.print("]");
                System.out.println();
            }
            System.out.println("\n------------------\n");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        printSubArray(arr);
    }
}