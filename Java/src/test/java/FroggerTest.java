import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import frogger.Frogger;
import frogger.Records;
import frogger.Road;

class FroggerTest {

    private Road road;
    private Records records;
    private Frogger frogger;

    @BeforeEach
    void setUp() {
        road = new Road(new boolean[10]);  // Жишээ зам
        records = new Records();  // Бичлэгийн систем
        frogger = new Frogger(road, 0, records, "John", "Doe", "1234567890", "12345", "NY", "Male");
    }

    @Test
    void testMoveForward() {
        // Урагш хөдөлгөх
        assertTrue(frogger.move(true));
        assertEquals(1, frogger.getPosition(), "Position should be 1 after moving forward once.");
    }

    @Test
    void testMoveBackward() {
        // Буцах
        frogger.move(true);  // Урагш хөдөлнө
        assertTrue(frogger.move(false)); // Буцах
        assertEquals(0, frogger.getPosition(), "Position should be 0 after moving backward once.");
    }

    @Test
    void testInvalidMove() {
        // Хэтэрхий урагш хөдөлгөх
        for (int i = 0; i < 10; i++) {
            frogger.move(true);  // Урагш хөдөлнө
        }
        assertFalse(frogger.move(true), "Should not be able to move beyond the road.");
    }

    @Test
    void testRecord() {
        // Бичлэг хийх
        frogger.move(true);  // Урагш хөдөлнө
        assertTrue(frogger.recordMyself(records), "Frogger should be recorded.");
    }

    @Test
    void testNoDuplicateRecords() {
        // Давтагдсан бүртгэл
        frogger.move(true);  // Урагш хөдөлнө
        frogger.recordMyself(records);
        assertFalse(frogger.recordMyself(records), "Frogger should not be recorded twice.");
    }
}
