package space.levan.algorithm.sorting;

import space.levan.algorithm.IAlgorithm;

/**
 * 希尔排序
 *
 * @author WangZhiYao
 * @date 2020/03/17
 */
public class ShellSort implements IAlgorithm {

    private static final String TAG = "ShellSort";

    private int[] arr;

    public ShellSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int length = arr.length;
        int temp;

        for (int step = length / 2; step >= 1; step /= 2) {
            for (int i = step; i < length; i++) {
                temp = arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }
    }
}
