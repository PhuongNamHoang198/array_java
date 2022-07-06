public class mergearray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = new int[(arr1.length + arr2.length)];


        System.out.printf("%-20s%s", "Element arr3: ", "");
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            } else if (i >= arr1.length) {
                arr3[i] = arr2[i - arr1.length];
            }
            System.out.print(arr3[i] + "\t");
        }
    }
}
