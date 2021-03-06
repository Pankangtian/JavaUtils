package com.kangtian.util.sort;

/**
 * User: FIRE
 * Date: 2018/9/15
 * Description:
 */
public class InsertSort {
    /**
     * 插入排序
     *
     * 从第一个元素开始，该元素可以认为已经被排序
     * 取出下一个元素，在已经排序的元素序列中从后向前扫描
     * 如果该元素（已排序）大于新元素，将该元素移到下一位置
     * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * 将新元素插入到该位置中
     * 重复步骤2
     * @param numbers  待排序数组
     */
    public static void insertSort(int[] numbers)
    {
        int size = numbers.length;
        int temp = 0 ;
        int j =  0;

        for(int i = 0 ; i < size ; i++)
        {
            temp = numbers[i];
            //假如temp比前面的值小，则将前面的值后移
            for(j = i ; j > 0 && temp < numbers[j-1] ; j --)
            {
                numbers[j] = numbers[j-1];
            }
            numbers[j] = temp;
        }
    }
}package com.kangtian.util.sort;

public class InsertSort {
    public static void sort(int[] arr){
        int len=arr.length,tem=0,j=0;
        for (int i=0;i<len;i++){
            tem=arr[i];
            for ( j=i;j>0&&arr[j-1]>tem;j--){//查找i插入的位置j，即j-1处大tem
                    arr[j]=arr[j-1];//将j到i-1处的所有元素向后挪一位
            }
            arr[j]=tem;//将原来i处的值赋给j处
        }
    }

}
