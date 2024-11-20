import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void division() {
        // Regular cases
        assertEquals(2, Division.division(10, 5));
        assertEquals(-2, Division.division(-10, 5));

        // Edge cases
        assertThrows(ArithmeticException.class, () -> Division.division(10, 0));
        assertEquals(0, Division.division(0, 5));
    }

    @Test
    void divisionUsingLoop() {
        // Optimized case with smaller input ranges
        assertEquals(2, Division.divisionUsingLoop(10, 5));
        assertEquals(-2, Division.divisionUsingLoop(-10, 5));

        // Limiting input size to prevent long-running tests
        assertEquals(1000000, Division.divisionUsingLoop(5000000, 5));
        assertThrows(ArithmeticException.class, () -> Division.divisionUsingLoop(10, 0));
    }

    @Test
    void divisionUsingRecursion() {
        // Optimized case with recursion depth limits
        assertEquals(2, Division.divisionUsingRecursion(10, 5));
        assertEquals(-2, Division.divisionUsingRecursion(-10, 5));

        // Smaller inputs to avoid stack overflow
        assertEquals(10, Division.divisionUsingRecursion(100, 10));
        assertThrows(ArithmeticException.class, () -> Division.divisionUsingRecursion(10, 0));
    }

    @Test
    void divisionUsingMultiplication() {
        // Regular cases
        assertEquals(2, Division.divisionUsingMultiplication(10, 5));
        assertEquals(-2, Division.divisionUsingMultiplication(-10, 5));

        // Larger inputs handled efficiently
        assertEquals(50000, Division.divisionUsingMultiplication(1000000, 20));
        assertThrows(ArithmeticException.class, () -> Division.divisionUsingMultiplication(10, 0));
    }

    @Test
    void divisionUsingShift() {
        // Regular cases
        assertEquals(2, Division.divisionUsingShift(10, 5));
        assertEquals(-2, Division.divisionUsingShift(-10, 5));

        // Edge case
        assertEquals(20000, Division.divisionUsingShift(400000, 20));
        assertThrows(ArithmeticException.class, () -> Division.divisionUsingShift(10, 0));
    }

    @Test
    void divisionUsingLogs() {
        // Regular cases
        assertEquals(2, Division.divisionUsingLogs(10, 5));
        assertEquals(-2, Division.divisionUsingLogs(-10, 5));

        // Edge cases with logarithmic handling
        assertEquals(100000, Division.divisionUsingLogs(1000000, 10));
        assertThrows(ArithmeticException.class, () -> Division.divisionUsingLogs(10, 0));
    }
}
