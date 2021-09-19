import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CarNumbersTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Ignore
    @Test
    public void test1() {
        CarNumbers carNumbers = new CarNumbers();
        String input = "3\n"
                + "ABC\n"
                + "A37\n"
                + "BCDA\n"
                + "2\n"
                + "A317BD\n"
                + "B137AC\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        carNumbers.solution();
        assertEquals("B137AC\n", output.toString());
    }

    @Ignore
    @Test
    public void test2() {
        CarNumbers carNumbers = new CarNumbers();
        String input = "2\n"
                + "1ABC\n"
                + "3A4B\n"
                + "3\n"
                + "A143BC\n"
                + "C143AB\n"
                + "AAABC1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        carNumbers.solution();
        assertEquals("A143BC\n"
                + "C143AB\n", output.toString());
    }

    @Ignore
    @Test
    public void test3() {
        CarNumbers carNumbers = new CarNumbers();
        String input = "1\n"
                + "AAAAAAAAAAAA\n"
                + "13\n"
                + "AAAAAAAAAAAAAB\n"
                + "BASD234234\n"
                + "ASDBSBF\n"
                + "BBBBBDS\n"
                + "SDASDSD\n"
                + "AAAAAA\n"
                + "BBBBBDS\n"
                + "ASDBSBF\n"
                + "AAAAAA\n"
                + "BABA\n"
                + "AB\n"
                + "A\n"
                + "AAAAAAAAAAAAAAAAAAAA\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        carNumbers.solution();
        assertEquals("AAAAAAAAAAAAAB\n"
                + "BASD234234\n"
                + "ASDBSBF\n"
                + "SDASDSD\n"
                + "AAAAAA\n"
                + "ASDBSBF\n"
                + "AAAAAA\n"
                + "BABA\n"
                + "AB\n"
                + "A\n"
                + "AAAAAAAAAAAAAAAAAAAA\n", output.toString());
    }

    @Test
    public void test4() {
        CarNumbers carNumbers = new CarNumbers();
        String input = "3\n"
                + "ABDEX\n"
                + "XBACD\n"
                + "BAXED\n"
                + "2\n"
                + "AAA\n"
                + "ABCD\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        carNumbers.solution();
        assertEquals("AAA\n"
                + "ABCD\n", output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(null);
    }
}