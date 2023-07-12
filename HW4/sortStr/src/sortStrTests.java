import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sortStrTests {
    @Test
    @DisplayName("Test 1")
    void Test1()
    {
        assertEquals("abcde", sortStr.sortStr("cdabe"));
    }
    @Test
    @DisplayName("Test 2")
    void Test2()
    {
        assertEquals("", sortStr.sortStr(""));
    }
    @Test
    @DisplayName("Test 3")
    void Test3()
    {
        assertEquals("a", sortStr.sortStr("a"));
    }
    @Test
    @DisplayName("Test 4")
    void Test4()
    {
        assertEquals("ab", sortStr.sortStr("ba"));
    }

    //parameterized tests

    // test case 4
    @ParameterizedTest
    @CsvSource({"ba,ab","dc,cd","na,an", "zd,dz"})
    void pTest4(String n1, String n2)
    {
        assertEquals(n2, sortStr.sortStr(n1));
    }

    //test case 1
    @ParameterizedTest
    @CsvSource({"nba,abn","nfl,fln","mlb,blm", "ucl,clu"})
    void pTest1(String n1, String n2)
    {
        assertEquals(n2, sortStr.sortStr(n1));
    }
    // test case 2 with a single element
    @ParameterizedTest
    @CsvSource({"a,a","b,b","c,c", "d,d"})
    void pTest3(String n1, String n2)
    {
        assertEquals(n2, sortStr.sortStr(n1));
    }
    


}
