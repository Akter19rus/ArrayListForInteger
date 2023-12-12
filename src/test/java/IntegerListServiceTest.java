import org.example.service.IntegerListService;
import org.example.service.IntegerServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerListServiceTest {
    private IntegerListService out;

    private final IntegerListService TEST_ARR = new IntegerServiceImpl();

    private final IntegerListService TEST_ARR_TWO = new IntegerServiceImpl();


    @Test
    void addCorrectly() {
        TEST_ARR.add(1);
        TEST_ARR.add(2);
        assertEquals(2, TEST_ARR.size());
    }

    @Test
    void testCorrectlyIndexAdd() {
        TEST_ARR.add(5);
        TEST_ARR.add(0, 6);
        assertEquals(2, (int) TEST_ARR.set(1, 2));

    }

    @Test
    void setCorrectly() {
        TEST_ARR.add(7);
        assertEquals(2, (int) TEST_ARR.set(0, 2));
    }

    @Test
    void removeItemCorrectly() {
        TEST_ARR.add(2);
        TEST_ARR.add(6);
        assertEquals(2, (int) TEST_ARR.remove(0));
    }

    @Test
    void removeIndexCorrectly() {
        TEST_ARR.add(2);
        assertEquals(2, (int) TEST_ARR.remove(0));
    }

    @Test
    void containsCorrectly() {
        TEST_ARR.add(2);
        assertTrue(TEST_ARR.contains(2));
    }

    @Test
    void indexOfCorrectly() {
        TEST_ARR.add(7);
        TEST_ARR.add(8);
        assertEquals(0, TEST_ARR.indexOf(7));
    }

    @Test
    void lastIndexOfCorrectly() {
        TEST_ARR.add(7);
        TEST_ARR.add(8);
        assertEquals(0, TEST_ARR.indexOf(7));
    }

    @Test
    void getCorrectly() {
        TEST_ARR.add(9);
        TEST_ARR.add(1);
        assertEquals(9, TEST_ARR.get(0));
    }

    @Test
    void testEqualsCorrectly() {
        TEST_ARR.add(2);
        TEST_ARR_TWO.add(2);
        assertTrue(TEST_ARR.equals(TEST_ARR_TWO));

    }

    @Test
    void sizeCorrectly() {
        TEST_ARR.add(2);
        TEST_ARR.add(3);
        assertEquals(2, TEST_ARR.size());
    }

    @Test
    void isEmptyCorrectly() {
        TEST_ARR.add(2);
        assertFalse(TEST_ARR.isEmpty());
    }

    @Test
    void clearCorrectly() {
        TEST_ARR.add(2);
        TEST_ARR.clear();
        assertEquals(0, TEST_ARR.size());
    }
}
