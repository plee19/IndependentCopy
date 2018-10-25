package independentcopy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ListWriterTest {
    ListWriter testWriter;
    ArrayList<String> arrayList;
    ListReader testReader;

    @Before
    public void setUp() throws Exception {
        arrayList = new ArrayList<>();
        testWriter = new ListWriter();
        testReader = new ListReader();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetArrayListNull() {
        assertNull(testWriter.getArrayList());
    }

    @Test
    public void testGetArrayList() {
        Copier copier = new Copier(testReader, testWriter);
        copier.copy();
        assertEquals(1, testWriter.getArrayList().size());
    }
}