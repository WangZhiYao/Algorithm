package space.levan.algorithm.sorting;

import space.levan.algorithm.IAlgorithm;

/**
 * 递归归并排序
 *
 * @author WangZhiYao
 * @date 2020/03/17
 */
public class RecursiveMergeSort implements IAlgorithm {

    public static final String TAG = "RecursiveMergeSort";

    private int[] arr;

    public RecursiveMergeSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int length = arr.length;
        int[] result = new int[length];
        recursiveMergeSort(arr, result, 0, length - 1);
        System.arraycopy(result, 0, arr, 0, length);
    }

    private void recursiveMergeSort(int[] arr, int[] result, int start, int end) {
        if (arr == null || arr.length <= 1 || start >= end) {
            return;
        }

        int len = end - start, mid = (len >> 1) + start;
        int start1 = start;
        int start2 = mid + 1;

        recursiveMergeSort(arr, result, start1, mid);
        recursiveMergeSort(arr, result, start2, end);

        int k = start;

        while (start1 <= mid && start2 <= end) {
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        }

        while (start1 <= mid) {
            result[k++] = arr[start1++];
        }

        while (start2 <= end) {
            result[k++] = arr[start2++];
        }

        for (k = start; k <= end; k++) {
            arr[k] = result[k];
        }
    }
}
