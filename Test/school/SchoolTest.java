package school;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SchoolTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void test1() {
        School school = new School();
        String input = "4\n"
                + "1 2 3 4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        school.solution();
        assertEquals("3\n", output.toString());
    }

    @Test
    public void test2() {
        School school = new School();
        String input = "3\n"
                + "-1 0 1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        school.solution();
        assertEquals("0\n", output.toString());
    }

    @Test
    public void test3() {
        School school = new School();
        String input = "5\n"
                + "-9 -1 8 9 10";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        school.solution();
        assertEquals("8\n", output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(null);
    }

}