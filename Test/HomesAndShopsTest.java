import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class HomesAndShopsTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void test() {
        HomesAndShops homesAndShops = new HomesAndShops();
        String input = "2 0 1 1 0 1 0 2 1 2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        homesAndShops.solution();
        assertEquals("3\n", output.toString());
    }

    @Test
    public void test2() {
        HomesAndShops homesAndShops = new HomesAndShops();
        String input = "0 1 0 0 1 2 2 1 0 2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        homesAndShops.solution();
        assertEquals("4\n", output.toString());
    }

    //1 2 1 2 0 0 1 0 1 0
    @Test
    public void test3() {
        HomesAndShops homesAndShops = new HomesAndShops();
        String input = "1 2 1 2 0 0 1 0 1 0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        homesAndShops.solution();
        assertEquals("5\n", output.toString());
    }

    @Test
    public void test4() {
        HomesAndShops homesAndShops = new HomesAndShops();
        String input = "0 1 0 1 0 0 2 1 2 1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        homesAndShops.solution();
        assertEquals("5\n", output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(null);
    }
}