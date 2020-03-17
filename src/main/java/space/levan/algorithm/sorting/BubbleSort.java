package space.levan.algorithm.sorting;

import space.levan.algorithm.IAlgorithm;

/**
 * 冒泡排序
 *
 * @author WangZhiYao
 * @date 2019/11/16
 */
public class BubbleSort implements IAlgorithm {

    public static final String TAG = "BubbleSort";

    private int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        if (arr == null || arr.length <= 1) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
