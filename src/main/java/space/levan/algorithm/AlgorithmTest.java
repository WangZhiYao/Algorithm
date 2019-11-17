package space.levan.algorithm;

/**
 * @author WangZhiYao
 * @date 2019/11/17
 */
public class AlgorithmTest implements IAlgorithm {

    private IAlgorithm mAlgorithm;

    public AlgorithmTest(IAlgorithm algorithm) {
        mAlgorithm = algorithm;
    }

    @Override
    public void run() {
        mAlgorithm.run();
    }
}
