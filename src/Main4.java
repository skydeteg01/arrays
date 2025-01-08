import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = i + 1;
            }else {
                arr[i] = i;
            }
            System.out.print(arr[i] + ", ");
        }
    }
}