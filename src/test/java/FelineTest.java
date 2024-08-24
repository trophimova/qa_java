import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void shouldEatMeat() throws Exception {
        List<String> food = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void shouldGetFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void shouldGetKittensWithDefaultCount() {
        int kittens = feline.getKittens();
        assertEquals(1, kittens);
    }

    @Test
    public void shouldGetKittensWithSpecificCount() {
        int kittens = feline.getKittens(3);
        assertEquals(3, kittens);
    }
}
