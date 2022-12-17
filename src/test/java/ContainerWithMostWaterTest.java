import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {

    @org.junit.Test
    public void maxArea() {

        int[] height = new int[] {1,8,6,2,5,4,8,3,7};
        int[] height2 = new int[] {1,1};
        int[] height3 = new int[] {1,3,2,5,25,24,5};

        int expected1 = 49;
        int expected2 = 1;
        int expected3 = 24;

        int actual1 = ContainerWithMostWater.maxArea(height);
        int actual2 = ContainerWithMostWater.maxArea(height2);
        int actual3 = ContainerWithMostWater.maxArea(height3);

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
        assertEquals(expected3,actual3);
    }
}