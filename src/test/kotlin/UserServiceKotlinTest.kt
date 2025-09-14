import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class UserServiceKotlinTest {
    private val repo = mockk<UserRepository>()
    private val service = UserService(repo)

    @Test
    fun `should greet user with mockk`() {
        every { repo.findNameById(1) } returns "Alice"
        assertEquals("Hello, Alice!", service.greetUser(1))
    }
}
