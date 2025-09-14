import kotlin.test.Test
import kotlin.test.assertEquals

class SquareKotlinTest {

    @Test
    fun `square should return correct value`() {
        // Directly calling Java method
        val result = Square.square(4)
        assertEquals(16, result)
    }
}
