import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FoldersTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

        @Before
        public void setUpStreams() {
            System.setOut(new PrintStream(output));
        }

        @Test
        public void test1() {
            Folders folders = new Folders();
            String input = "2\n"
                    + "2 1\n";
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            folders.solution();
            assertEquals("1\n", output.toString());
        }

        @After
        public void cleanUpStreams() {
            System.setOut(null);
            System.setIn(null);
        }

}