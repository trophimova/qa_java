import com.example.Feline;
import com.example.LionAlex;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    private Feline feline;

    LionAlex lionAlex;

    @Before
    public void setUp() throws Exception {
        lionAlex = new LionAlex(feline);
    }

    @Test
    public void shouldGetFriends() {
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        List<String> actualFriends = lionAlex.getFriends();
        assertEquals(expectedFriends, actualFriends);
    }

    @Test
    public void shouldGetPlaceOfLiving() {
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        String actualPlaceOfLiving = lionAlex.getPlaceOfLiving();
        assertEquals(expectedPlaceOfLiving, actualPlaceOfLiving);
    }

    @Test
    public void shouldGetKittens() {
        when(feline.getKittens(0)).thenReturn(0);

        int actualKittens = lionAlex.getKittens();
        assertEquals(0, actualKittens);
        verify(feline, times(1)).getKittens(0);
    }
}
