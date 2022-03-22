import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void plusTest() {
        // arrange
    int a = 5, b = 5, expected = 10;
        // act
        int result = calc.plus.apply(a, b);
        // assert
        assertEquals(expected, result);
    }

    @Test
    public void powTest() {
        // arrange
        int a = 10, expected = 100;
        // act
        int result = calc.pow.apply(a);
        // assert
        assertEquals(expected, result);
    }

    @Test
    public void isPositiveTest() {
        // arrange
        int a = 44;
        boolean expected = true;
        // act
        boolean result = calc.isPositive.test(a);
        // assert
        assertEquals(expected, result);
    }

    @Test
    public void plusTestHamcrest() {
        int result = calc.plus.apply(5, 5);
        assertThat(result, equalTo(10));
    }

    @Test
    public void powTestHamcrest() {
        int result = calc.pow.apply(5);
        assertThat(result, equalTo(25));
    }

    @Test
    public void isPositiveHamcrest() {
        boolean result = calc.isPositive.test(4);
        assertThat(result, equalTo(true));
        assertThat(result, hasToString("true"));
    }

    @Test
    public void compareTest(){
        int a = calc.plus.apply(5,5);
        int b = calc.minus.apply(12,6);
        assertThat(b, not(comparesEqualTo(a)));
    }

    @Test
    public void greaterTest() {
        int a = calc.plus.apply(8, 6);
        int b = calc.pow.apply(4);
        assertThat(b, is(greaterThan(a)));
    }
}
