package sort;

import java.util.List;

public interface ISortable<T> {
    public void sort(List<T> list, IComparator<T> comparator);
}