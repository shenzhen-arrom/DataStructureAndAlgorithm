package sort;

/**
 *  冒泡排序 (也可以从后面向前选择，意思和从前往后一样)
 *  原理：
 *      1.比较相邻的元素。如果第一个比第二个大，就交换，
 *      2.对每一对相邻元素做同样的工作，从开始第一对到结尾最后一对。经过一轮之后最大的元素会选出来。
 *      3.对剩下的n-1个元素采用类似的步骤。
 */
class BubbleSort{

    /**
     *  普通版本的冒泡排序
     * @param list
     */
    public void bubbleSortV1(int[] list){

        //2.剩下的数据排序
        for (int j = 0; j < list.length-1; j++) {
              //1.先做完第一轮的排序
            for (int i = 0; i < list.length-1-j; i++) {
                if(list[i]>list[i+1]){ //需要交换
                    swap(list[i],list[i+1]);
                }
            }
        }
    }
    /**
     *  优化版本的冒泡排序
     *  通过设置一个标志，每轮比较的时候，如果发现没有需要进行交换的说明数据已经有序，退出循环，停止比较
     * @param list
     */
    public void bubbleSortV2(int[] list){
        boolean change = false;
        //2.剩下的数据排序
        for (int j = 0; j < list.length-1; j++) {
              //1.先做完第一轮的排序
            for (int i = 0; i < list.length-1-j; i++) {
                if(list[i]>list[i+1]){ //需要交换
                    swap(list[i],list[i+1]);
                    change = true;
                }
            }
            if(!change){
                break;
            }
        }
    }
 /**
     *  优化版本的冒泡排序
     *  
     * @param list
     */
    public void bubbleSortV3(int[] list){
        //2.剩下的数据排序
        for (int j = 0; j < list.length-1; j++) {
              //1.先做完第一轮的排序
            int changeIndex = 0；
            for (int i = 0; i < list.length-1-j; i++) {
                if(list[i]>list[i+1]){ //需要交换
                    swap(list[i],list[i+1]);
                    changeIndex = i+1；
                }
            }
            j = changeIndex;
        }
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
