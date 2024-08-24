import com.example.Feline;
import com.example.Lion;
import com.example.constants.AnimalKind;
import com.example.constants.Sex;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.*;
import static org.mockito.Mockito.*;

@RunWith(Parameterized.class)
public class LionTest {

    private final String sex;
    private final boolean hasMane;

    @Rule
    public MockitoRule mockito = MockitoJUnit.rule();

    @Mock
    Feline feline;

    Lion lion;

    @Before
    public void setUp() throws Exception {
        lion = new Lion(sex, feline);
    }

    public LionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Sex.MALE.getDescription(), true},
                {Sex.FEMALE.getDescription(), false}
        });
    }

    @Test
    public void shouldHaveMane() {
        assertEquals(hasMane, lion.doesHaveMane());
    }

    @Test
    public void shouldGetKittens() {
        when(feline.getKittens()).thenReturn(3);

        int kittens = lion.getKittens();
        assertEquals(3, kittens);
        verify(feline, times(1)).getKittens();
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> expectedListOfFood = List.of("Животные", "Птицы", "Рыба");

        when(feline.getFood(AnimalKind.PREDATOR.getDescription())).thenReturn(expectedListOfFood);

        List<String> food = lion.getFood();

        assertEquals(expectedListOfFood, food);
        verify(feline, times(1)).getFood(AnimalKind.PREDATOR.getDescription());
    }
}
