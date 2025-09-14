import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareJavaTest {
    @Test
    void squareShouldReturnCorrectValue() {
        assertEquals(9, Square.square(3));
    }
}
