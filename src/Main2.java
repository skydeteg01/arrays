import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {1, 7, 9};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ", ");
        }
    }
}