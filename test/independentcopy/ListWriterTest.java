package independentcopy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ListWriterTest {
    ListWriter testWriter;
    ArrayList<String> arrayList;

    @Before
    public void setUp() throws Exception {
        arrayList = new ArrayList<>();
        arrayList.add("Java");
        testWriter = new ListWriter(arrayList);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetArrayList() {
        assertEquals(arrayList, testWriter.getArrayList());
    }
}