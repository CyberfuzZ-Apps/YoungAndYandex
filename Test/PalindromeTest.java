import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PalindromeTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

        @Before
        public void setUpStreams() {
            System.setOut(new PrintStream(output));
        }

        @Test
        public void test1() {
            Palindrome palindrome = new Palindrome();
            String input = "a\n";
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            palindrome.solution();
            assertEquals("0\n", output.toString());
        }

        @Test
        public void test2() {
            Palindrome palindrome = new Palindrome();
            String input = "ab\n";
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            palindrome.solution();
            assertEquals("1\n", output.toString());
        }

        @Test
        public void test3() {
            Palindrome palindrome = new Palindrome();
            String input = "cognitive\n";
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            palindrome.solution();
            assertEquals("4\n", output.toString());
        }

        @Test
        public void test4() {
            Palindrome palindrome = new Palindrome();
            String input = "cognitived\n";
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            palindrome.solution();
            assertEquals("5\n", output.toString());
        }

        @After
        public void cleanUpStreams() {
            System.setOut(null);
            System.setIn(null);
        }

}