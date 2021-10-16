
public interface SetInterface<T> {

    int size();

    boolean isEmpty();

    // boolean add(Object o);
    boolean add(T element);

    //boolean contains(Object o);
    boolean contains(T element);

    boolean remove(T element);
    //  boolean remove(Object o);

    void clear();
}
