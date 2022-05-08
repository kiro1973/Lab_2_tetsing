import org.junit.Test;

import static org.junit.Assert.*;

public class MinMaxTest {



    @Test
    public void test1() {
        int [] arr={7,1,2,5,11,4,3,25,0};
        MinMax m= new MinMax();
        int[]expected_result=new int[]{0,25};
        assertArrayEquals(expected_result, m.getMinMax(arr));
    }
    @Test
    public void test_repeated_Max() {
        int [] arr={7,1,2,5,11,4,3,25,0,25};
        MinMax m= new MinMax();
        int[]expected_result=new int[]{0,25};
        assertArrayEquals(expected_result,m.getMinMax(arr));
    }
    @Test
    public void test_repeated_negative_Min() {
        int [] arr={7,1,2,5,11,4,3,25,0,0,-10,-10};
        MinMax m= new MinMax();
        int[]expected_result=new int[]{-10,25};
        assertArrayEquals(expected_result,m.getMinMax(arr));
    }
}