import static org.junit.jupiter.api.Assertions.*;

class GeometrProgressionTest {

    @Test
    void testGeometrFive() {
        GeometrProgression geometrProgression = new GeometrProgression(1,2);  //проверка через JUnit 4 с доп в Gradle
        assertEquals(31, geometrProgression.calculateSum(5));
    }

    @Test
    void testGeometrZero() {
        GeometrProgression geometrProgression = new GeometrProgression(1,2);
        assertEquals(0, geometrProgression.calculateSum(0));
    }

}