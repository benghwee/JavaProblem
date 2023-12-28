package algorithm;

import static junit.framework.TestCase.assertEquals;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class UnitTest01 {
    
    @BeforeClass
    public static void instantiate() {
        
    }

    @Test
    public void test_01() {
        int[] testArray1 = { 3, 9, 50, 15, 99, 7, 98, 65 };
        int result = Util.closestDistanceNumbers(testArray1);
        assertEquals(1, result);
    }

    @Test
    public void test_02() {
        int[] testArray2 = { 1, 6, 50, 15, 99, 65, 70, 120, 156 };
        int result = Util.closestDistanceNumbers(testArray2);
        assertEquals(5, result);
    }

    @Test
    public void test_03() {
        int[] testArray3 = { 1, 9, 50, 15, 96, 7, 65, 102 };
        int result = Util.closestDistanceNumbers(testArray3);
        assertEquals(2, result);
    }

    @Test
    public void test_04() {
        int[] testArray4 = { 6, 12, 50, 15, 105, 9, 98, 65 };
        int result = Util.closestDistanceNumbers(testArray4);
        assertEquals(3, result);
    }
}
