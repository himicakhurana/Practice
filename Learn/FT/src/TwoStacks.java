import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoStacks {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }

        public T peek() {
              stackOldestOnTop.clear();
            T top=null;
            while(stackNewestOnTop.size()!=0)
            {
                top=stackNewestOnTop.peek();
                stackNewestOnTop.pop();
                stackOldestOnTop.push(top);

            }
            top=stackOldestOnTop.peek();
            while(stackNewestOnTop.size()<stackOldestOnTop.size())
            {
               
                stackNewestOnTop.push(stackOldestOnTop.peek());
            }
            return top;
        }

        public T dequeue() {
            stackOldestOnTop.clear();
            T top=null;
            while(!stackNewestOnTop.isEmpty())
            {
                stackOldestOnTop.push(stackNewestOnTop.peek());
                stackNewestOnTop.pop();
            }
            
            top=stackOldestOnTop.peek();
            stackOldestOnTop.pop();
             while(stackNewestOnTop.size()<stackOldestOnTop.size())
            {
               
                stackNewestOnTop.push(stackOldestOnTop.peek());
            }

            return top;
        }
    }

    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
