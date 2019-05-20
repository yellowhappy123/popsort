package sort;

/**
 * QuickSort
 * Created by huangx on 2019/5/17.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] list = {3, 4, 1, 2, 9, 6, 3};
        quickSort(list, 0, list.length - 1);
    }

    public static void quickSort(int[] list, int left, int right) {
        if (right <= left) {
            return;
        }
        int i = left;
        int j = right;
        while (i < j) {
            while (list[i] <= list[j] && i < j) {
                j--;
            }
            swap(list, i, j);
            while (list[j] >= list[i] && i < j) {
                i++;
            }
            swap(list, i, j);
        }
        quickSort(list, left, i - 1);
        quickSort(list, i + 1, right);
    }

    public static void swap(int[] list, int a, int b) {
        int t = list[a];
        list[a] = list[b];
        list[b] = t;
    }
}
