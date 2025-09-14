import kotlin.test.Test
import kotlin.test.assertEquals

class Greeter {
    fun greet(name: String) = "Hello, $name!"
}

class GreeterTest {

    @Test
    fun `should greet correctly`() {
        val greeter = Greeter()
        assertEquals("Hello, Kotlin!", greeter.greet("Kotlin"))
    }
}
