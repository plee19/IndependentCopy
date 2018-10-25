package independentcopy;

import java.util.ArrayList;

public class ListWriter implements Writer {
    ArrayList<String> arrayList;

    public ListWriter(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    public void writeln(String str) {
        arrayList.add(str);
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }
}
