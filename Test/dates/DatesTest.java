package dates;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DatesTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void test1() {
        Dates dates = new Dates();
        String input = "1 2 2003\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        dates.solution();
        assertEquals("0\n", output.toString());
    }

    @Test
    public void test2() {
        Dates dates = new Dates();
        String input = "2 29 2008\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        dates.solution();
        assertEquals("1\n", output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(null);
    }
}