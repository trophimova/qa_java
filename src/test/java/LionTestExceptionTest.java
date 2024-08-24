import com.example.Feline;
import com.example.Lion;
import com.example.constants.Sex;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionTestExceptionTest {

    @Mock
    Feline feline;

    @Test
    public void shouldThrowExceptionForInvalidSex() {
        String expectedMessage = "Используйте допустимые значения пола животного - " + Sex.MALE.getDescription() + " или " + Sex.FEMALE.getDescription();

        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Неправильный пол", feline);
        });
        assertEquals(expectedMessage, exception.getMessage());
    }
}
