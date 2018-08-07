package com.stack;

import com.stack.StackClass;

/**
 *
 * @author ariful
 */
public class Main {

    public static void main(String[] args) {
        StackClass s = new StackClass(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(50);
        s.push("akash");
        s.push(50);
        s.push(50);
        s.display();
    }

}
