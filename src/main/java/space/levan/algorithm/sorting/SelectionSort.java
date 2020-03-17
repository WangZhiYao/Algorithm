package space.levan.algorithm.sorting;

import space.levan.algorithm.IAlgorithm;

/**
 * 选择排序
 *
 * @author WangZhiYao
 * @date 2019/11/16
 */
public class SelectionSort implements IAlgorithm {

    public static final String TAG = "SelectionSort";

    private int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        if (arr == null || arr.length <= 1) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
