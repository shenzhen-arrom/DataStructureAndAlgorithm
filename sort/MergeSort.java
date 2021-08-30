package sort;

/**
 *  (分治策略)
 *  归并排序
 *    原理：
 *      1.首先将数组分成一半
 *      2.然后想办法把左，右两边数组给排序，最后合并起来（左右合并的时候也需要排序）
 */
public class MergeSort {


    public void mergeSort(int[] list,int low,int high){
        int middleIndex= list.length/2;
        if(low<high){
            //将数组分成两个
            mergeSort(list, low, middleIndex);
            mergeSort(list, middleIndex+1, high);
            //左右合并
            merge(list, low,middleIndex, high);
        }
    }
    /**
     *  合并
     * @param list
     * @param low
     * @param mid
     * @param high
     */
    private void merge(int[] list,int low,int mid,int high){
        //创建一个数组
        int[] temp = new int[high-low+1];
        int i = low;//左边
        int j = mid+1; //右边
        int k = 0;
        //把较小的数据移动到temp数组里面
        while(i<=mid && j<=high){
            //k++ ,i++,j++  会移动角标
            if(list[i]<list[j]){
               temp[k++] = list[i++];
            }else{
               temp[k++] = list[j++];
            }
        }
        //把左边剩余的数据移动到temp中
        while(i<=mid){
            temp[k++] = list[i++];
        }
        //把右边剩余的数据移动到temp中
        while(j<=high){
            temp[k++] = list[j++];
        }
        //把temp里面的数据覆盖到list里面的数据
        for (int x = 0; x < temp.length; x++) {
            list[x+low] = temp[x];
        }
    }
    
}
