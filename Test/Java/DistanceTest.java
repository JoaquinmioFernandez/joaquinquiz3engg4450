import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {

    @Test
    void chebyshevDistance() {
        // Regular cases
        assertEquals(3, Distance.chebyshevDistance(new long[]{1, 2}, new long[]{4, 5}));
        assertEquals(0, Distance.chebyshevDistance(new long[]{3, 3}, new long[]{3, 3}));

        // Edge cases
        assertEquals(Long.MAX_VALUE, Distance.chebyshevDistance(new long[]{Long.MAX_VALUE, 0}, new long[]{0, 0}));
        assertEquals(Long.MAX_VALUE, Distance.chebyshevDistance(new long[]{0, Long.MAX_VALUE}, new long[]{0, 0}));
    }

    @Test
    void squaredDistance() {
        // Regular cases
        assertEquals(25, Distance.squaredDistance(1, 2, 4, 5));
        assertEquals(0, Distance.squaredDistance(3, 3, 3, 3));

        // Edge cases
        assertEquals(Double.POSITIVE_INFINITY, Distance.squaredDistance(Double.MAX_VALUE, 0, 0, 0));
    }

    @Test
    void euclideanDistance() {
        // Regular cases
        assertEquals(5, Distance.euclideanDistance(1, 1, 4, 5), 0.001);
        assertEquals(0, Distance.euclideanDistance(0, 0, 0, 0), 0.001);

        // Edge cases
        assertThrows(ArithmeticException.class, () -> Distance.euclideanDistance(Double.POSITIVE_INFINITY, 0, 0, 0));
    }
}
