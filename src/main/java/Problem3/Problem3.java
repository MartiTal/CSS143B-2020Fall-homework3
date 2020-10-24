package Problem3;

import Problem1.LinkedListStack;
import Problem1.Stack;
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        // homework
        // !!! must use your ArrayStack or LinkedListStack in problem 1
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        list = list.next;
        while (list != null) {
            stack.push(list.val);
            list = list.next;
        }
        while (stack.peek() != null) {
            print.println(stack.pop());
        }

        // print with the following format. System.out.println() will not pass test.
        // print.println("hello world");   // place holder
    }
}
