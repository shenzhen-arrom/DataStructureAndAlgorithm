package sort;

/**
 * 堆排序：
 *   原理：
 *    1.从最后一个非叶子节点开始，每三个节点做一次大小比较，最小的做根，移动过程中如果树上的顺序被破坏了，子树上重新调整三个节点的位置
 *    2.取走整个树的根节点，把最后一个叶子节点作为根节点
 *    3.重复1和2，直到所有的节点被取走
 */
public class HeapSort {

    /**
     *  大顶堆的调整过程
     * @param array
     * @param start 起点
     * @param end  终点
     */
    public void maxHeapModify(int[] array,int start,int end){

        //父亲的位置
        int dad = start;
        // 儿子的位置
        int son = dad*2 +1;
        while(son<=end){//如果子节点下标在可以调整的范围内就一直调整下去
            //如果没有右孩子就不用比，比较两个儿子，选择最大出来
            if(son+1<=end&&array[son]<array[son+1]){
                son++;
            }
            //和父节点比较大小
            if(array[dad]>array[son]){
                return;
            }else{//父亲比儿子小，要对整个子树进行调整
                int temp= array[son];
                array[son] = array[dad];
                array[dad] = temp;
                //递归下一层
                dad = son;
                son = dad*2+1;
            }

        }

    }

    /**
     * 堆排序
     * @param array
     * @param len 数组的长度
     */
    public void heapSort(int[] array,int len){
        //建堆  len/2-1 最后一个非子节点
        for (int i = len/2-1; i >0; i--) {
            maxHeapModify(array, i, len-1);
        }
        //排序，根节点和最后一个节点交换，换完以后，取走根，重新建堆  len-1 最后一个节点
        for (int i = len-1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            maxHeapModify(array, 0, i-1);
        }

    }

    
}
