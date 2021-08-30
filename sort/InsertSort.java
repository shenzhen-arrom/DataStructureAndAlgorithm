package sort;
/**
 *  插入排序
 *    原理：
 *      将一组数据分成两组，我分别将其称为有序组与待插入组。每次从待插入组中取出一个元素，与有序组的元素进行比较，并找到合适的位置，
 *      将该元素插到有序组当中。就这样，每次插入一个元素，有序组增加，待插入组减少。直到待插入组元素个数为0
 */
public class InsertSort {

    /**
     *  插入排序
     * @param list
     * @return
     */
    public int[] insertSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            //将有序数组和无序数组使用同一个
            for (int j = i; j > 0; j--) {
                if(list[j]<list[j-1]){//需要交换
                    swap(list[j],list[j-1]);
                }
            }
        }
        return list;
    }
    /**
     *  插入排序
     *   上面的插入需要定义个temp赋值，会造成浪费
     *    我们可以把需要插入的数保存起来，然后进行比较，最后插入
     * @param list
     */
    public int[] insertSort2(int[] list){
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j;
            for (j= i; j >0&&list[j-1]>temp; j--) {
                list[j] = list[j-1];
            }
            list[j] = temp;//将需要插入的数据放入到这个位置
        }

        return list;
       
    }

     /**
     *  交换位置
     * @param a
     * @param b
     */
    private void swap(int a,int b){
        int tmep = a;
        a = b ;
        b = tmep;
    }
    
}
