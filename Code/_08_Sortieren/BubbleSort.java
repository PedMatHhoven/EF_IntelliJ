package _08_Sortieren;

public class BubbleSort {
    public static int[] sort(int[] a) {
        for (int i=0; i < a.length-1; i++) {
            for (int j=1; j < a.length; j++) {
                if (a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int arr[] = {8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Array vor dem Sortieren");
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        arr = sort(arr);
        System.out.println("Array nach dem Sortieren");
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}                                   