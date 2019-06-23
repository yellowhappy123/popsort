package popsort.sort;

/**
 * MergeSort
 * Created by huangx on 2019/6/4.
 */
public class MergeSort {
    public static void main(String[] args) {
        int a[] = {5, 3, 1, 2, 8, 9, 3, 2, 5, 4, 6};
        int temp[] = new int[a.length];
        mergerSort(a, 0, a.length - 1, temp);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void mergerSort(int a[], int left, int right, int[] temp) {
        if (right > left) {
            int mid = (right + left) / 2;
            mergerSort(a, left, mid, temp);
            mergerSort(a, mid + 1, right, temp);
            merger(a, left, mid, right, temp); //合并
        }
    }

    //合并
    public static void merger(int a[], int left, int mid, int right, int temp[]) {
        int i = left;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right) {
            if (a[i] < a[j]) {
                temp[t] = a[i];
                i++;
            } else {
                temp[t] = a[j];
                j++;
            }
            t++;
        }

        while (i <= mid) {
            temp[t] = a[i];
            i++;
            t++;
        }

        while (j <= right) {
            temp[t] = a[j];
            j++;
            t++;
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while (left <= right) {
            a[left++] = temp[t++];
        }
    }

    public void mergerSort2(int[] a, int left, int right, int[] temp) {
        if (right < left) {
            return;
        }
        int mid = (left + right) / 2;
        mergerSort2(a, left, mid, temp);
        mergerSort2(a, mid + 1, right, temp);
    }

    public void merger2(int[] a, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid;
        int t = 0;
        while (i < mid && j < right) {
            if (a[i] < a[j]) {
                temp[t]=a[i];
            }else {
                temp[t]=a[j];
            }
            t++;
        }
    }
}
