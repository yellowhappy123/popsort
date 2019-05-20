package sort;

/**
 * Created by huangx on 2019/5/11.
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] aa = new int[]{1, 2, 4, 3, 7, 5, 8};
        //insert_sort(aa, 7);
        insertSort(aa, 7);
    }

    /*
 * 直接插入排序
 *
 * 参数说明：
 *     a -- 待排序的数组
 *     n -- 数组的长度
 */
    public static void insert_sort(int a[], int n) {
        int i, j, k;
        for (i = 1; i < n; i++) {
            //为a[i]在前面的a[0...i-1]有序区间中找一个合适的位置
            for (j = i - 1; j >= 0; j--)
                if (a[j] < a[i])
                    break;

            //如找到了一个合适的位置
            if (j != i - 1) {
                //将比a[i]大的数据向后移
                int temp = a[i];
                for (k = i - 1; k > j; k--)
                    a[k + 1] = a[k];
                //将a[i]放到正确位置上
                a[k + 1] = temp;
            }
        }
    }


    public static void insertSort(int[] list, int len) {
        if (len < 2) {
            return;
        }
        int temp=0;
        int k=0;
      for(int i=1;i<len;i++){
            if (list[i]<list[i-1]){
                temp=list[i];
                k=i;
                for (int j=i;j>0;j--){
                    if (temp<list[j]){
                        list[j+1]=list[j];
                        k--;
                    }
                }
                list[k]=temp;
            }

      }
    }
}
