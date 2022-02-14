package data.structure;

import java.util.LinkedList;

/**
 * @author William
 */

// DATA STRUCTURES
public class Queue<E> {

    private LinkedList<E> linkedList = new LinkedList<>();

    public void enqueue(E item) {
        linkedList.addLast(item);
    }

    public E dequeue() {
        return linkedList.poll();
    }

    public boolean hasItems() {
        return !linkedList.isEmpty();
    }

    public int size() {
        return linkedList.size();
    }

    public void addItems(Queue<? extends E> queue) {
        while (queue.hasItems()) {
            linkedList.addLast(queue.dequeue());
        }
    }
}