import java.util.*;

public class SetForTest<T> implements SetInterface<T> {

    private HashMap<T, Object> map;
    private static final Object PRESENT = new Object();

    public SetForTest() {
        map = new HashMap<>();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean add(T o) {
        return map.put(o, PRESENT) == null;
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public boolean remove(T o) {
        return map.remove(o) == PRESENT;
    }

    @Override
    public void clear() {
        map = new HashMap<>();
    }

    @Override
    public boolean isEmpty() {
        return map.size() == 0;
    }
}
