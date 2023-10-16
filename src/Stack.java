import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<T> implements Iterable<T> {
    private final T[] arrayForStack;
    private int top;

    public Stack(int size) {
        arrayForStack = (T[]) new Object[size];
        top = -1;
    }

    public void push(T data) {
        if (isFull()) {
            System.out.println("Стэк полон");
            return;
        }
        arrayForStack[++top] = data;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Стэк пуст");
            return null;
        }
        return arrayForStack[top--];
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Стэк пуст");
            return null;
        }
        return arrayForStack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arrayForStack.length - 1;
    }



    public void show() {
        if (isEmpty()) {
            System.out.println("Стэк пуст");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(arrayForStack[i]);
        }
        System.out.println();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int index = top;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return arrayForStack[index--];
            }
        };
    }}
