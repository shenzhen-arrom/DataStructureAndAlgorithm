package sort;

/**
 * 
 * 
 * 快速排序流程： (处理大数据最快的排序算法之一) 
 * (1) 从数列中挑出一个基准值。 
 * (2) 将所有比基准值小的摆放在基准前面，所有比基准值大的摆在基准的后面(相同的数可以到任一边)；在这个分区退出之后，该基准就处于数列的中间位置。
 * (3) 递归地把"基准值前面的子数列"和"基准值后面的子数列"进行排序。
 * 
 */
public class QuickSort {

    /**
     * 
     * @param list 带排序的数组
     * @param low  数组的左边界
     * @param high 数组的有边界
     */
    public void quickSort(int[] list, int low, int high) {
        int i, j, temp;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        // 把数组中的第一数做为基准
        temp = list[i];

        // 如果i < j的话，一直执行
        while (i < j) {
            // 先看右边，依次往左递减
            while (i < j && list[j] >= temp) {
                j--; // 从右向左寻找第一个小于基准值
            }
            // 再看左边，依次往右递增
            while (i < j && list[i] <= temp) {
                i++;//// 从左向右寻找第一个大于基准值
            }
            // 如果满足条件则交换
            if (i < j) {
                temp = list[j];
                list[j] = list[i];
                list[i] = temp;
            }
        }
        // 将基准数和i对应的数据互换
        list[low] = list[i];
        list[i] = temp;
        // 分成两个数组递归调用
        quickSort(list, 1, j - 1);
        quickSort(list, j + 1, j);

    }

}
