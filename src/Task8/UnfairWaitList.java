package Task8;

import java.util.concurrent.ConcurrentLinkedDeque;

public class UnfairWaitList <E> extends WaitList <E> {
    public UnfairWaitList() {}

    public void remove(E element) {
        content.remove(element);
    }

    /**
     * Метод перемещения элемента списка ожидания в конец
     * Перемещение выполняется только если такой элемент
     * есть в списке
     * @param element - элемент, перемещаемый в конец
     * */
    public void toBack(E element) {
        if (content.size() > 1 && content.contains(element)){
            ConcurrentLinkedDeque<E> tmp = new ConcurrentLinkedDeque<>();
            content.remove(element);
            tmp.addAll(content);
            tmp.add(element);
            content = tmp;
        }
    }
}
