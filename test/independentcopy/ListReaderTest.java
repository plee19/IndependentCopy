package independentcopy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ListReaderTest {
    ArrayList<String> testArray;
    ListReader testReader;

    @Before
    public void setUp() throws Exception {
        testArray = new ArrayList<>();
        testArray.add("Java");
        testReader = new ListReader();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testReadln() {
        assertEquals("Java", testReader.readln());
    }
}