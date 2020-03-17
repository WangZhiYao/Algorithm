package space.levan.algorithm;

import org.junit.Test;
import space.levan.algorithm.sorting.RecursiveMergeSort;

import java.util.Arrays;

/**
 * @author WangZhiYao
 * @date 2019/11/17
 */
public class AlgorithmTest {

    private static final int[] arr = new int[]{13, 14, 94, 33, 82, 25, 59, 94, 65, 23, 45, 27, 73, 25, 39, 10};

    @Test
    public void test() {
        IAlgorithm algorithm = new RecursiveMergeSort(arr);
        algorithm.run();
        System.out.println(Arrays.toString(arr));
    }
}
