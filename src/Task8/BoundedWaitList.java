package Task8;

public class BoundedWaitList <E> extends WaitList <E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    /**
     * Добавление нового элемента в список ожидания
     * с учетом максимального числа элементов в нем.
     * При переполнении списка, в консоль выводится
     * предупреждающее сообщение
     * @param element - добавляемый элемент
     * */
    @Override
    public void add(E element) {
        if (content.size() < capacity){
            super.add(element);
        } else {
            System.out.println("Bounded wait list is full!");
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}
