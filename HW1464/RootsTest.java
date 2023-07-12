import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RootsTest {

    @Test
    @DisplayName("Test Case 1")
    void Test1() {
        Roots.calculate_roots(1,-6,-16);
        assertEquals(8, Roots.first_root());
        assertEquals(-2, Roots.second_root());
        assertEquals(2, Roots.num_roots());
    }
    @Test
    @DisplayName("Test Case 2")
    void Test2() {
        Roots.calculate_roots(2,4,2);
        assertEquals(-1, Roots.first_root());
        assertEquals(1, Roots.num_roots());
    }
    @Test
    @DisplayName("Test Case 3")
    void Test3() {
        Roots.calculate_roots(2,3,4);
        assertEquals(-1, Roots.first_root());
        assertEquals(-1, Roots.second_root());
        assertEquals(0, Roots.num_roots());
    }


}