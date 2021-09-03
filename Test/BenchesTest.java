import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BenchesTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void test1() {
        Benches benches = new Benches();
        String input = "5 2\n"
                + "0 2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        benches.solution();
        assertEquals("2\n", output.toString());
    }

    @Test
    public void test2() {
        Benches benches = new Benches();
        String input = "13 4\n"
                + "1 4 8 11\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        benches.solution();
        assertEquals("4 8\n", output.toString());
    }

    @Test
    public void test3() {
        Benches benches = new Benches();
        String input = "14 6\n"
                + "1 6 8 11 12 13\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        benches.solution();
        assertEquals("6 8\n", output.toString());
    }

    @Test
    public void test4() {
        Benches benches = new Benches();
        String input = "4 4\n"
                + "0 1 2 3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        benches.solution();
        assertEquals("1 2\n", output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(null);
    }

}