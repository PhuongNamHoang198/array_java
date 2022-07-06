import java.util.Scanner;

public class delete_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]arr = {1,2,3,4,4,5,6,8,9,10,11,44,22};

        System.out.println("Nhap phan tu can xoa");
        int x = scanner.nextInt();
        int indexDel =1;
        for (int i = 0; i<arr.length; i++,indexDel++){
            if (arr[i] == x){
                System.out.println(" Vi tri phan tu xoa la: " + indexDel);
                int j = i;
                while (j<arr.length-1){
                    arr[j] = arr[j+1];
                    arr[j+1]=0;
                    j++;
                }
                i--;
            }
        }
        for (int element : arr){
            System.out.println(element);
        }

    }
}
