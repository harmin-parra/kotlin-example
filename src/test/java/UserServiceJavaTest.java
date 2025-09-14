import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceJavaTest {

    @Test
    void greetUserWithMockito() {
        UserRepository repo = mock(UserRepository.class);
        when(repo.findNameById(2)).thenReturn("Bob");

        UserService service = new UserService(repo);
        assertEquals("Hello, Bob!", service.greetUser(2));
    }
}
