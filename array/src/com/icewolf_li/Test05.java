package com.icewolf_li;

//测试Arrays类
import java.util.Arrays;
public class Test05 {
    public static void main(String[] args) {
//        int[] a = {1,2};
//        System.out.println(a);
//        System.out.println(Arrays.toString(a));

        int[] a={1,2,323,23,543,12,59};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //返回排序后新的索引位置，若未找到返回负数。
        System.out.println("该元素的索引:"+Arrays.binarySearch(a,12));

    }
}
