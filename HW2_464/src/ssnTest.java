import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ssnTest
{
    @Test
    @DisplayName("Test Case 1")
    void Test1()
    {
        assertEquals("valid ssn", ssnCorrected.validateSSN("019-20-2022"));

    }
    @Test
    @DisplayName("Test Case 2")
    void Test2()
    {
        assertEquals("Incorrect format", ssnCorrected.validateSSN("01920-2022"));

    }
    @Test
    @DisplayName("Test Case 3")
    void Test3()
    {
        assertEquals("invalid ssn", ssnCorrected.validateSSN("000-20-2022"));

    }
    @Test
    @DisplayName("Test Case 4")
    void Test4()
    {
        assertEquals("invalid ssn", ssnCorrected.validateSSN("666-23-4312"));

    }
    @Test
    @DisplayName("Test Case 5")
    void Test5()
    {
        assertEquals("Incorrect format", ssnCorrected.validateSSN("01920-2022-1-"));

    }
    @Test
    @DisplayName("Test Case 6")
    void Test6()
    {
        assertEquals("invalid ssn", ssnCorrected.validateSSN("934-23-4312"));

    }
    @Test
    @DisplayName("Test Case 7")
    void Test7()
    {
        assertEquals("valid ssn", ssnCorrected.validateSSN("839-23-4312"));

    }
    @Test
    @DisplayName("Test Case 8")
    void Test8()
    {
        assertEquals("invalid ssn", ssnCorrected.validateSSN("839-233-4312"));

    }
    @Test
    @DisplayName("Test Case 9")
    void Test9()
    {
        assertEquals("invalid ssn", ssnCorrected.validateSSN("839-2-4312"));

    }
    @Test
    @DisplayName("Test Case 10")
    void Test10()
    {
        assertEquals("invalid ssn", ssnCorrected.validateSSN("0293-20-4312"));

    }
    @Test
    @DisplayName("Test Case 11")
    void Test11()
    {
        assertEquals("invalid ssn", ssnCorrected.validateSSN("023-20-43132"));

    }
    @Test
    @DisplayName("Test Case 12")
    void Test12()
    {
        assertEquals("invalid ssn", ssnCorrected.validateSSN("023-20-432"));

    }
    @Test
    @DisplayName("Test Case 13")
    void Test13()
    {
        assertEquals("invalid ssn", ssnCorrected.validateSSN("99-20-4312"));

    }

}