package sort;

/**
 * 希尔排序 原理： 
 *  希尔排序是将待排序的数组元素 按下标的一定增量分组 ，分成多个子序列，
 *  然后对各个子序列进行直接插入排序算法排序；然后依次缩减增量再进行排序，
 *  直到增量为1时，进行最后一次直接插入排序，排序结束
 */
public class HillSort {

    /**
     * 希尔排序
     * 
     * @param list
     * @param step 步长
     * @return
     */
    public int[] hillSort(int[] list, int step) {
        if (list == null || list.length <= 1) {
            return list;
        }
        for (int k = 0; k < step; k++) {
            // 快速排序
            for (int i = k + step; i < list.length; i = i + step) {
                int j = i;
                int target = list[j];
                while (j > step - 1 && target < list[j - step]) {
                    list[j] = list[j - step];
                    j = j - step;
                }
                list[j] = target;
            }
        }

        return list;
    }

}
