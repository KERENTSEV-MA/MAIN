import static org.junit.jupiter.api.Assertions.*;

class ArithmProgressionTest {

    @Test
    public void testArithmFive() {
        ArithmProgression arithmProgression = new ArithmProgression(1,2);  //проверка через JUnit 4 с доп в Gradle
        assertEquals(25, arithmProgression.calculateSum(5));
    }

    @Test
    public void testArithmZero() {
        ArithmProgression arithmProgression = new ArithmProgression(1,2);
        assertEquals(0, arithmProgression.calculateSum(0));
    }

}