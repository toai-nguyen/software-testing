import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class EvenOddCheckerTest {

    @Test
    public void testWithInput1() {
        List<String> result = EvenOddChecker.getEvenOddList(5);
        assertEquals(5, result.size());
        assertEquals("1 là số lẻ.", result.get(0));
        assertEquals("2 là số chẵn.", result.get(1));
        assertEquals("3 là số lẻ.", result.get(2));
        assertEquals("4 là số chẵn.", result.get(3));
        assertEquals("5 là số lẻ.", result.get(4));
    }

    @Test
    public void testWithInput2() {
        List<String> result = EvenOddChecker.getEvenOddList(2);
        assertEquals(2, result.size());
        assertEquals("1 là số lẻ.", result.get(0));
        assertEquals("2 là số chẵn.", result.get(1));
    }

    @Test
    public void testWithInput5() {
        List<String> result = EvenOddChecker.getEvenOddList(5);
        assertEquals(5, result.size());
        assertEquals("1 là số lẻ.", result.get(0));
        assertEquals("2 là số chẵn.", result.get(1));
        assertEquals("3 là số lẻ.", result.get(2));
        assertEquals("4 là số chẵn.", result.get(3));
        assertEquals("5 là số lẻ.", result.get(4));
    }

    @Test
    public void testWithZero() {
        List<String> result = EvenOddChecker.getEvenOddList(0);
        assertTrue(result.isEmpty());
    }
}
