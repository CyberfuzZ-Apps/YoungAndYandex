import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class FrequencyAnalysisTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

        @Before
        public void setUpStreams() {
            System.setOut(new PrintStream(output));
        }

        @Test
        public void test1() {
            FrequencyAnalysis frequencyAnalysis = new FrequencyAnalysis();
            String input = "hi\n"
                    + "hi\n"
                    + "what is your name\n"
                    + "my name is bond\n"
                    + "james bond\n"
                    + "my name is damme\n"
                    + "van damme\n"
                    + "claude van damme\n"
                    + "jean claude van damme\n";
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            frequencyAnalysis.solution();
            assertEquals("damme\n"
                    + "is\n"
                    + "name\n"
                    + "van\n"
                    + "bond\n"
                    + "claude\n"
                    + "hi\n"
                    + "my\n"
                    + "james\n"
                    + "jean\n"
                    + "what\n"
                    + "your\n", output.toString());
        }

    @Test
    public void test2() {
        FrequencyAnalysis frequencyAnalysis = new FrequencyAnalysis();
        String input = "oh you touch my tralala\n"
                + "mmm my ding ding dong\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        frequencyAnalysis.solution();
        assertEquals("ding\n"
                + "my\n"
                + "dong\n"
                + "mmm\n"
                + "oh\n"
                + "touch\n"
                + "tralala\n"
                + "you\n", output.toString());
    }

    @Test
    public void test3() {
        FrequencyAnalysis frequencyAnalysis = new FrequencyAnalysis();
        String input = "ai ai ai ai ai ai ai ai ai ai\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        frequencyAnalysis.solution();
        assertEquals("ai\n", output.toString());
    }

    @Test
    public void test4() {
        FrequencyAnalysis frequencyAnalysis = new FrequencyAnalysis();
        InputStream in = null;
        try {
            in = new FileInputStream("013.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setIn(in);
        frequencyAnalysis.solution();
        assertEquals("nnwfabnmrocl\n" +
                "jzz\n", output.toString());
    }

        @After
        public void cleanUpStreams() {
            System.setOut(null);
            System.setIn(null);
        }

}