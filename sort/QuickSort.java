package popsort.sort;

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


    //以下为快排的实现二
    public static int quickSort2(int[] list, int start, int end) {
        int i = start;
        //i为比a[r]大的元素的下标，初始为开始位置l
        for (int j = start; j < end; j++) {
            if (list[j] <= list[end]) {                               //如果元素比a[r]小则和大的元素交换位置，目的让小的放一起，大的放一起
                int t = list[j];                                 //可以自己手运行几遍这个循环
                list[j] = list[i];
                list[i] = t;
                i++;
            }
        }
        int t = list[i];                                   //a[i]为小元素和大元素的交界处，将a[r]与之交换
        list[i] = list[end];
        list[end] = t;
        return i;
    }

    //快排
    public static void KP(int[] list, int left, int right) {
        if (left < right) {                                   //递归结束条件为组中只剩一个元素
            int p = quickSort2(list, left, right);                    //分成俩组返回交界处
            KP(list, left, p - 1);                  //继续分左边
            KP(list, p + 1, right);
        }
    }
}
