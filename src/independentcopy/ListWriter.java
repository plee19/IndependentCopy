package independentcopy;

import java.util.ArrayList;

/**
 * Writes to a designated ArrayList. Implements Writer interface.
 * @author Elijah Ligrow, Andre Araujo, Paul Lee
 * @version 1.0
 */

public class ListWriter implements Writer {
    ArrayList<String> arrayList;

    /**
     * Constructor for ListWriter. Takes ArrayList to use in further methods
     * @param arrayList ArrayList<String>: ArrayList to base further methods upon
     */
    //public ListWriter(ArrayList<String> arrayList) {
      //  this.arrayList = arrayList;
    //}

    /**
     * Writes string value to ArrayList
     * @param str String: value to write to ArrayList
     */
    public void writeln(String str) {
        arrayList = new ArrayList<>();
        arrayList.add(str);
    }

    /**
     * Returns the ArrayList
     * @return ArrayList<String>: ArrayList to return
     */
    public ArrayList<String> getArrayList() {
        return arrayList;
    }
}
