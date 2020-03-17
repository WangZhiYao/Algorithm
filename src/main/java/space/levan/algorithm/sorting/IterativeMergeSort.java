package space.levan.algorithm.sorting;

import space.levan.algorithm.IAlgorithm;

/**
 * 迭代归并排序
 *
 * @author WangZhiYao
 * @date 2020/03/17
 */
public class IterativeMergeSort implements IAlgorithm {

    public static final String TAG = "IterativeMergeSort";

    private int[] arr;

    public IterativeMergeSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int[] result = new int[arr.length];

        for (int i = 2; i < arr.length * 2; i *= 2) {
            for (int j = 0; j < (arr.length + i - 1) / i; j++) {
                int left = i * j;
                int mid = left + i / 2 >= arr.length ? (arr.length - 1) : (left + i / 2);
                int right = i * (j + 1) - 1 >= arr.length ? (arr.length - 1) : (i * (j + 1) - 1);
                int start = left;
                int l = left;
                int m = mid;

                while (l < mid && m <= right) {
                    if (arr[l] < arr[m]) {
                        result[start++] = arr[l++];
                    } else {
                        result[start++] = arr[m++];
                    }
                }

                while (l < mid) {
                    result[start++] = arr[l++];
                }

                while (m <= right) {
                    result[start++] = arr[m++];
                }

                System.arraycopy(result, left, arr, left, right - left + 1);
            }
        }
    }
}
