package sort;

/**
 * 二分查找法（在有序数组中找到某个特定元素的搜索算法）
 *   原理：
 *      1.从数组的中间元素开始，如果中间元素正好是要找的元素，则搜索结束。如果大于或者小于中间元素，
 *      则在数组大于或小于中间元素的那一半中查找。
 *      2.重复第一步，直到某一步数组为空，代表找不到。
 */
public class BinarySearch {

      /**
       *  在list数组中寻找target的元素
       * @param list
       * @param target
       * @return  target元素的角标
       */
      public int binarySearch(int[] list,int target){

        //数组的长度
        int left=0;
        int right= list.length-1;
        while(left<=right){
            int mid = (right+left)/2 ;
            if(list[mid] ==target){
                return mid;
            }else if(list[mid]<target){//向右边找
                left = mid+1;
            }else if(list[mid]>target){//左边查找
                right = mid -1;
            }
        }
        return -1;
      }

    
}
