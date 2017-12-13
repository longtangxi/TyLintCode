import org.junit.Assert;
import org.junit.Test;

public class ty001Test {
    @Test
    public void findTwoAddendIdx() throws Exception {
        ty001 m = new ty001();

        int[] src = {2, 7, 11, 15};
        Assert.assertArrayEquals(new int[]{1, 2}, m.findTwoAddendIdx(src, 9));
        Assert.assertArrayEquals(new int[]{1, 3}, m.findTwoAddendIdx(src, 13));
        Assert.assertArrayEquals(new int[]{1, 4}, m.findTwoAddendIdx(src, 17));
        Assert.assertArrayEquals(new int[]{0, 0}, m.findTwoAddendIdx(src, 34));
    }

}