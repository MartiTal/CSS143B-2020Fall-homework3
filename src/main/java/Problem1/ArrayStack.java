package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        // homework
        data = (T[]) new Object[capacity];
        //To understand why I couldn't declare a new T[] array, I looked at this page:
        //https://stackoverflow.com/questions/2927391/whats-the-reason-i-cant-create-generic-array-types-in-java
    }

    @Override
    public boolean push(T val) {
        // homework
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = val;
                size++;
                return true;
            }
        }
        return false;
    }

    @Override
    public T pop() {
        // homework
        for (int i = data.length-1; i >= 0; i--) {
            if (data[i] != null) {
                T val = data[i];
                data[i] = null;
                size--;
                return val;
            }
        }
        return null;
    }

    @Override
    public T peek() {
        // homework
        for (int i = data.length-1; i >= 0; i--) {
            if (data[i] != null) {
                return data[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
