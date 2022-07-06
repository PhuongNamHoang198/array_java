import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] arr = {4,2,3,11,3,4};
        int index = minValue(arr);
        System.out.println("the smallest element: " + arr[index]);

    }
    public static int minValue(int[] array) {
        int index =0;
        for (int i =1; i<array.length; i++) {
            if (array[i] <array[index]) {
                index = i;
            }
        }
        return index;
    }
}
