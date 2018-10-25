package independentcopy;

import java.util.ArrayList;

public class ListReader implements Reader {
    ArrayList<String> arrayList;

    public ListReader(ArrayList<String> someList) {
        this.arrayList = someList;
    }
    @Override
    public String readln() {
        return arrayList.get(arrayList.size() - 1);
    }
}
