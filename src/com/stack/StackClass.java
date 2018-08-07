package com.stack;

/**
 *
 * @author ariful
 */
public class StackClass<T> {

    int maxSize;
    int topIndex;
    Object[] arr;

    public StackClass(int n) {
        maxSize = n;
        arr = new Object[n];
        topIndex = -1;
    }

    public boolean isEmpty() {
        return topIndex == -1;

    }

    public boolean isFull() {
        return topIndex >= maxSize - 1;
    }

    public void push(T a) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            arr[++topIndex] = a;
        }

    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            return (T) arr[--topIndex];
        }
    }

    public T top() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        }
        return (T) arr[topIndex];

    }

    void display() {
        if (isEmpty()) {
            System.out.print("Stack is empty");
        } else {
            for (int i = 0; i <= topIndex; i++) {
                System.out.print(arr[i].toString() + " ");
            }
        }
    }

}
