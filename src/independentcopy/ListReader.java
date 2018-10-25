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
     * Constructor method for ListReader. Takes ArrayList to use in further methods
     * @param someList ArrayList<String>: ArrayList to base further methods upon
     */
    public ListReader(ArrayList<String> someList) {
        this.arrayList = someList;
    }

    /**
     * Reads values in ArrayList. Overrides from Reader.
     * @return String: String value in ArrayList
     */
    @Override
    public String readln() {
        return arrayList.get(arrayList.size() - 1);
    }
}
