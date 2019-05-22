package popsort.sort;

/**
 * DictionarySort  字典序排序，一般用于排列
 * Created by huangx on 2019/5/6.
 */
public class DictionarySort {
    public static void main(String[] args) {
        int[] list = {1, 2, 3};
        dsort(list);
    }

    //字典序
    public static void dsort(int[] list) {
        int a = 10;
        int num = 1;
        for (int i = list.length; i > 0; --i)     //计算有多少种情况，就循环多少次
            num *= i;
        while (num > 0) {
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i]);
            }
            System.out.println();
            a = findIndex(list);
            findGiantNum(list, a);
            sort(list, a + 1);
            num--;
        }
    }

    public static int findIndex(int list[]) {
        for (int i = list.length - 1; i > 0; i--) {
            if (list[i - 1] < list[i]) {
                return i - 1;
            }
        }
        return 0;
    }

    public static void findGiantNum(int list[], int index) {
        for (int i = list.length - 1; i > index; i--) {
            if (list[index] < list[i]) {
                int temp = list[i];
                list[i] = list[index];
                list[index] = temp;
                break;
            }
        }
    }


    //冒泡排序
    public static void sort(int[] list, int index) {
        for (int i = index; i < list.length; i++) {
            for (int j = i; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
