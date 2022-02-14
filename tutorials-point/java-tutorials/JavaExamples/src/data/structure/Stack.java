package data.structure;

/**
 * @author William
 */

// DATA STRUCTURES
public class Stack {

    private int maxSize;
    private int[] data;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        data = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        data[++top] = value;
    }

    public int pop() {
        return data[top--];
    }

    public int peek() {
        return data[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}