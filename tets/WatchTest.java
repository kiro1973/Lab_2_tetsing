import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class WatchTest {
    @Test
    public void edge_coverage() {
        Watch edges = new Watch();
        String inputs = "aabadcdcbababababa";
        String output = "Current state: Normal_Display,current inner state: Time , Date: 2/2/2001  Time: 01:01";
        Assert.assertEquals(output, edges.watch(inputs));
    }
    @Test
    public void test_0_adup() {
        Watch edges = new Watch();
        String inputs = "cbbabbabbabbabb";
        String output = "Current state: Update,current inner state: year , Date: 3/3/2002  Time: 02:02";
        Assert.assertEquals(output, edges.watch(inputs));
    }
    @Test
    public void test1() {
        Watch first = new Watch();
        String inputs = "abadacaad";
        String output = "Current state: Normal_Display,current inner state: Time , Date: 1/1/2000  Time: 00:00";
        Assert.assertEquals(output, first.watch(inputs));
    }

    @Test
    public void test2() {
        Watch second = new Watch();
        String inputs = "cbababababa";
        String output = "Current state: Normal_Display,current inner state: Time , Date: 2/2/2001  Time: 01:01";
        Assert.assertEquals(output, second.watch(inputs));
    }

    @Test
    public void test3() {
        Watch third_test = new Watch();
        String inputs = "cbbabbbaaaa";
        String output = "Current state: Normal_Display,current inner state: Time , Date: 1/1/2000  Time: 03:02";
        Assert.assertEquals(output, third_test.watch(inputs));
    }

    @Test
    public void test4() {
        Watch fourth_test = new Watch();
        String inputs = "caabbabbbbabbba";
        String output = "Current state: Normal_Display,current inner state: Time , Date: 3/5/2003  Time: 00:00";
        Assert.assertEquals(output, fourth_test.watch(inputs));
    }

}