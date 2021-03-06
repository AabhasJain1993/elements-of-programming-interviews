import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class QueueWithStacksTest {

    private int size;

    @Test
    public void circularQueue1() throws Exception {
        size = 5;

        test(size);
    }

    @Test
    public void circularQueue2() throws Exception {
        size = 10;

        test(size);
    }

    @Test
    public void circularQueue3() throws Exception {
        size = 50;

        test(size);
    }

    private void test(int size) {
        final QueueWithStacks queue = new QueueWithStacks();
        List<Integer> integers = StreamUtil.sequence(size);
        integers.forEach(
                i -> queue.enqueue(i)
        );
        integers.forEach(
                i -> assertEquals(i,queue.dequeue())
        );
    }

}