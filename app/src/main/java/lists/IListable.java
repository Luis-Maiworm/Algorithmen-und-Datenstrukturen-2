package lists;

public interface IListable<T> {
    void add(T data);

    void insert(int index, T data);

    T get(int index);

    void set(int index, T data);

    void clear();

    int size();

    void addLast(T data); // Same as add method

    void addFirst(T data);

    boolean isEmpty();

    void remove(int index);

    void removeLast();

    void printAll();
}