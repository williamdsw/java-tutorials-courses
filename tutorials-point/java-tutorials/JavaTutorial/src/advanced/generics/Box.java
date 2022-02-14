package advanced.generics;

/**
 * @author William
 * @param <T>
 */

// GENERIC CLASS
public class Box<T> {

    private T value;

    public Box() {
    }

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void add(T value) {
        this.value = value;
    }
}