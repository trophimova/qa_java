import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    Cat cat;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void shouldGetSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void shouldGetFood() throws Exception {
        List<String> expectedListOfFood = List.of("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expectedListOfFood);
        List<String> food = cat.getFood();
        assertEquals(expectedListOfFood, food);
        verify(feline, times(1)).eatMeat();
    }
}
