package space.levan.algorithm.sorting;

import space.levan.algorithm.IAlgorithm;

/**
 * 快速排序
 *
 * @author WangZhiYao
 * @date 2019/11/16
 */
public class QuickSort implements IAlgorithm {

    public static final String TAG = "QuickSort";

    private int[] arr;

    public QuickSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int head, int tail) {
        if (head >= tail || arr == null || arr.length <= 1) {
            return;
        }

        int i = head, j = tail, pivot = arr[(head + tail) / 2];
        while (i <= j) {
            while (arr[i] < pivot) {
                ++i;
            }
            while (arr[j] > pivot) {
                --j;
            }
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                ++i;
                --j;
            } else if (i == j) {
                ++i;
            }
        }
        quickSort(arr, head, j);
        quickSort(arr, i, tail);
    }
}
