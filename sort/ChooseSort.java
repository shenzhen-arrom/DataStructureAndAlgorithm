package sort;

/**
 *  选择排序：
 *   原理：
 *     1.从N个元素中找出关键字最小的与第一个元素交换
 *     2.从2个元素开始找出里面的最小的元素，与第二元素互换，以此类推
 *     （核心是记录最小元素的角标）
 */
class ChooseSort{

    /**
     *  选择排序
     * @param list
     */
    public void chooseSort(int[] list){
        //默认第一个是最小值
        int index = 0;
        for (int j = 0; j < list.length; j++) {
            for (int i = j+1; i < list.length; i++) {
                if(list[index]>list[i]){
                    //记录角标
                    index = i;
                }
            }
            //交换元素（发现最小是第一个数据，则不需要交换）
            if(j!=index){
                //记录每轮的第一个元素
                int temp = list[j];
                list[j] = list[index];
                list[index] = temp;
            }
        }
       
    }
   

}
