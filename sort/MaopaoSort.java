package popsort.sort;

/**
 * MaopaoSort
 * Created by huangx on 2019/5/22.
 */
public class MaopaoSort {
    public static void main(String[] args) {
        int[] list = {8, 4, 6, 8, 1, 3, 5, 1};
        maopaoSort(list);
    }

    public static int[] maopaoSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
        return list;
    }
}
