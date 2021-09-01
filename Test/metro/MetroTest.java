package metro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MetroTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void test1() {
        Metro metro = new Metro();
        String input = "100 5 6\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        metro.solution();
        assertEquals("0\n", output.toString());
    }

    @Test
    public void test2() {
        Metro metro = new Metro();
        String input = "10 1 9\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        metro.solution();
        assertEquals("1\n", output.toString());
    }

    @Test
    public void test3() {
        Metro metro = new Metro();
        String input = "11 1 6\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        metro.solution();
        assertEquals("4\n", output.toString());
    }

    @Test
    public void test4() {
        Metro metro = new Metro();
        String input = "11 3 9\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        metro.solution();
        assertEquals("4\n", output.toString());
    }

    @Test
    public void test5() {
        Metro metro = new Metro();
        String input = "10 2 10\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        metro.solution();
        assertEquals("1\n", output.toString());
    }

    @Test
    public void test6() {
        Metro metro = new Metro();
        String input = "10 8 3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        metro.solution();
        assertEquals("4\n", output.toString());
    }

    @Test
    public void test7() {
        Metro metro = new Metro();
        String input = "7 1 2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        metro.solution();
        assertEquals("0\n", output.toString());
    }

    @Test
    public void test8() {
        Metro metro = new Metro();
        String input = "7 1 3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        metro.solution();
        assertEquals("1\n", output.toString());
    }

    @Test
    public void test9() {
        Metro metro = new Metro();
        String input = "7 1 4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        metro.solution();
        assertEquals("2\n", output.toString());
    }

    @Test
    public void test10() {
        Metro metro = new Metro();
        String input = "7 1 5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        metro.solution();
        assertEquals("2\n", output.toString());
    }

    @Test
    public void test11() {
        Metro metro = new Metro();
        String input = "7 1 6\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        metro.solution();
        assertEquals("1\n", output.toString());
    }

    @Test
    public void test12() {
        Metro metro = new Metro();
        String input = "7 1 7\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        metro.solution();
        assertEquals("0\n", output.toString());
    }

    @Test
    public void test13() {
        Metro metro = new Metro();
        String input = "99 98 2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        metro.solution();
        assertEquals("2\n", output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(null);
    }

}