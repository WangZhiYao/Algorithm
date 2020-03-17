package space.levan.algorithm.sorting;

import space.levan.algorithm.IAlgorithm;

/**
 * 堆排序
 *
 * @author WangZhiYao
 * @date 2020/03/17
 */
public class HeapSort implements IAlgorithm {

    public static final String TAG = "HeapSort";

    private int[] arr;

    public HeapSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int length = arr.length - 1;
        int begin = (arr.length >> 1) - 1;

        for (int i = begin; i >= 0; i--) {
            maxHeap(i, length);
        }

        for (int i = length; i > 0; i--) {
            swap(0, i);
            maxHeap(0, i - 1);
        }
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void maxHeap(int index, int length) {
        int lc = (index << 1) + 1;
        int rc = lc + 1;
        int cMax = lc;

        if (lc > length) {
            return;
        }

        if (rc <= length && arr[rc] > arr[lc]) {
            cMax = rc;
        }

        if (arr[cMax] > arr[index]) {
            swap(cMax, index);
            maxHeap(cMax, length);
        }
    }
}
