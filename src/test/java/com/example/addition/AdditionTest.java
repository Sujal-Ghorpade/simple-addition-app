import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {

    @Test
    public void testAdd() {
        assertEquals(5, Addition.add(2, 3));
        assertEquals(0, Addition.add(2, -2));
        assertEquals(-7, Addition.add(-4, -3));
    }
}
