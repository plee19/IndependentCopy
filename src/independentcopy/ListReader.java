package independentcopy;

import java.util.ArrayList;

/**
 * Reads through a designated ArrayList. Implements Reader interface.
 * @author Elijah Ligrow, Andre Araujo, Paul Lee
 * @version 1.0
 */
public class ListReader implements Reader {
    ArrayList<String> arrayList;

    /**
     * Reads values in ArrayList. Overrides from Reader.
     * @return String: String value in ArrayList
     */
    @Override
    public String readln() {
        arrayList = new ArrayList<>();
        arrayList.add("Java");
        return arrayList.get(arrayList.size() - 1);
    }
}
