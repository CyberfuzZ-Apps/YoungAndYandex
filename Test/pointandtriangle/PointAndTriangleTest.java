package pointandtriangle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PointAndTriangleTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void test1() {
        PointAndTriangle pointAndTriangle = new PointAndTriangle();
        String input = "5\n"
                + "1 1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        pointAndTriangle.solution();
        assertEquals("0\n", output.toString());
    }

    @Test
    public void test2() {
        PointAndTriangle pointAndTriangle = new PointAndTriangle();
        String input = "3\n"
                + "-1 -1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        pointAndTriangle.solution();
        assertEquals("1\n", output.toString());
    }

    @Test
    public void test3() {
        PointAndTriangle pointAndTriangle = new PointAndTriangle();
        String input = "4\n"
                + "4 4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        pointAndTriangle.solution();
        assertEquals("2\n", output.toString());
    }

    @Test
    public void test4() {
        PointAndTriangle pointAndTriangle = new PointAndTriangle();
        String input = "4\n"
                + "2 2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        pointAndTriangle.solution();
        assertEquals("0\n", output.toString());
    }

    @Test
    public void test5() {
        PointAndTriangle pointAndTriangle = new PointAndTriangle();
        String input = "100\n"
                + "50 -40";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        pointAndTriangle.solution();
        assertEquals("1\n", output.toString());
    }

    @Test
    public void test6() {
        PointAndTriangle pointAndTriangle = new PointAndTriangle();
        String input = "100\n"
                + "0 100";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        pointAndTriangle.solution();
        assertEquals("0\n", output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(null);
    }


}