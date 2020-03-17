package space.levan.algorithm.sorting;

import space.levan.algorithm.IAlgorithm;

/**
 * 插入法排序
 *
 * @author WangZhiYao
 * @date 2019/11/16
 */
public class InsertionSort implements IAlgorithm {

    public static final String TAG = "InsertionSort";

    private int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        if (arr == null || arr.length <= 1) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }
}
