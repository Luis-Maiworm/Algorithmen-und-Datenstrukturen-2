package sort;

import java.util.List;

public class SelectionSort<T> extends Swap<T> implements ISortable<T> {

    @Override
    public void sort(List<T> list, IComparator<T> comparator) {
        int minimum;
        for (int i = 0; i < list.size(); i++) {
            minimum = i;
            for (int e = i + 1; e < list.size(); ++e) {
                if (comparator.compare(list.get(e), list.get(minimum)) < 0) {
                    minimum = e;
                }
            }
            swap(list, i, minimum);
        }
    }

}