import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class EvenOddCheckerPath {

    // 1. Không vào vòng lặp (n = 0)
    @Test
    public void testEmptyInput() {
        List<String> result = EvenOddChecker.getEvenOddList(0);
        assertTrue(result.isEmpty(), "Danh sách phải rỗng khi n = 0");
    }

    // 2. Chỉ gặp nhánh else (n = 1)
    @Test
    public void testOnlyOdd() {
        List<String> result = EvenOddChecker.getEvenOddList(1);
        assertEquals(1, result.size());
        assertEquals("1 là số lẻ.", result.get(0));
    }

    // 3. Chỉ gặp nhánh if (n = 2, nhưng kiểm tra riêng i=2)
    @Test
    public void testOnlyEvenPartially() {
        List<String> result = EvenOddChecker.getEvenOddList(2);
        assertEquals(2, result.size());
        assertEquals("1 là số lẻ.", result.get(0));
        assertEquals("2 là số chẵn.", result.get(1));
    }

    // 4. Gặp cả nhánh if và else lặp nhiều lần (n = 5)
    @Test
    public void testMixedEvenOdd() {
        List<String> result = EvenOddChecker.getEvenOddList(5);
        assertEquals(5, result.size());
        assertEquals("1 là số lẻ.", result.get(0));
        assertEquals("2 là số chẵn.", result.get(1));
        assertEquals("3 là số lẻ.", result.get(2));
        assertEquals("4 là số chẵn.", result.get(3));
        assertEquals("5 là số lẻ.", result.get(4));
    }

    // 5. Gặp đủ nhiều nhánh, kiểm tra biên lớn hơn (n = 10)
    @Test
    public void testLargerInput() {
        List<String> result = EvenOddChecker.getEvenOddList(10);
        assertEquals(10, result.size());
        for (int i = 0; i < 10; i++) {
            int value = i + 1;
            if (value % 2 == 0) {
                assertEquals(value + " là số chẵn.", result.get(i));
            } else {
                assertEquals(value + " là số lẻ.", result.get(i));
            }
        }
    }
}

