package ListArr;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrToList {

    public static <T> List<T> toList(T[] arr) {
        List<T> list = new LinkedList<>();
        for (T element : arr) {
            list.add(element);
        }
        return list;
    }

}
