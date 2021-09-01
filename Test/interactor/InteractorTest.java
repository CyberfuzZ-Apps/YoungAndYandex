package interactor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class InteractorTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void test1() {
        Interactor interactor = new Interactor();
        String input = "0\n0\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        interactor.solution();
        assertEquals("0\n", output.toString());
    }

    @Test
    public void test2() {
        Interactor interactor = new Interactor();
        String input = "-1\n0\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        interactor.solution();
        assertEquals("3\n", output.toString());
    }

    @Test
    public void test3() {
        Interactor interactor = new Interactor();
        String input = "42\n1\n6\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        interactor.solution();
        assertEquals("6\n", output.toString());
    }

    @Test
    public void test4() {
        Interactor interactor = new Interactor();
        String input = "44\n7\n4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        interactor.solution();
        assertEquals("1\n", output.toString());
    }

    @Test
    public void test5() {
        Interactor interactor = new Interactor();
        String input = "1\n4\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        interactor.solution();
        assertEquals("3\n", output.toString());
    }

    @Test
    public void test6() {
        Interactor interactor = new Interactor();
        String input = "-3\n2\n4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        interactor.solution();
        assertEquals("2\n", output.toString());
    }


    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(null);
    }
}