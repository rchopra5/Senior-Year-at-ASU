import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class sortTestCases {
    int [] res = {0, 1, 2, 3, 4};
    int [] test = {1, 3, 4, 2, 0};
    @Test
    @DisplayName("Test Case 1")

    // Test case with size of n > 0
    void Test1()
    {
        Assert.assertArrayEquals(res, bubbleSort.bubbleSortEfficient(test,5) );
    }


    @Test
    @DisplayName("Test Case 2")
    // Test case with empty array
    void Test2()
    {
        Assert.assertArrayEquals(new int[]{}, bubbleSort.bubbleSortEfficient(new int[]{},0) );
    }

    @Test
    @DisplayName("Test Case 3")
        // Test case with single element array
    void Test3()
    {
        Assert.assertArrayEquals(new int[]{1}, bubbleSort.bubbleSortEfficient(new int[]{1},1) );
    }

    @Test
    @DisplayName("Test Case 4")
        // Test case with already sorted array
    void Test4()
    {
        Assert.assertArrayEquals(new int[]{1,2,3,4}, bubbleSort.bubbleSortEfficient(new int[]{1,2,3,4},4) );
    }

}
