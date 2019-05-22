package popsort.algorithm;

/**
 * DynamicProgramming
 * Created by huangx on 2019/5/11.
 */
//求最长增长序列
public class DynamicProgramming {
    public static void main(String[] args) {
        int[] a = new int[]{3, 10, 5, 15, 11, 12, 13, 14, 6, 8, 9};
        System.out.println(largest(a, a.length));
    }


    public static int largest(int[] list, int len) {
        int[] maxSer = new int[len];
        int max = 1;
        maxSer[0] = 1;
        for (int i = 1; i < len; i++) {
            int templen = 0;
            for (int j = 0; j < i; j++) {
                if (list[j] < list[i] && templen < maxSer[j]) {
                    templen = maxSer[j];
                }
            }
            maxSer[i] = templen + 1;
            if (maxSer[i] > max) {
                max = maxSer[i];
            }
        }
        return max;
    }
}
