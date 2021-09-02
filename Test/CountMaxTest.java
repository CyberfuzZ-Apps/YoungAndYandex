import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CountMaxTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void test1() {
        CountMax countMax = new CountMax();
        String input = """
                1
                7
                9
                0
                """;
                InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        countMax.solution();
        assertEquals("1\n", output.toString());
    }

    @Test
    public void test2() {
        CountMax countMax = new CountMax();
        String input = """
                1
                3
                3
                1
                0
                """;
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        countMax.solution();
        assertEquals("2\n", output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(null);
    }

}