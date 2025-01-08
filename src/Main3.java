public class Main3 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        for (int i = arr1.length-1; i != -1 ; i--) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();

        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = arr1.length-1; i != -1 ; i--) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println();

        int[] arr3 = {1, 7, 9};
        for (int i = arr1.length-1; i != -1 ; i--) {
            System.out.print(arr3[i] + ", ");
        }
    }
}