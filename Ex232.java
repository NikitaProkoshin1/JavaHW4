package JavaHW4;

import java.util.Stack;

public class Ex232 {
    class MyQueue {
        Stack<Integer> in;
        Stack<Integer> out;

        public MyQueue() {
            in = new Stack<>();
            out = new Stack<>();
        }

        private int front;

        public void push(int x) {
            if (in.empty()) {
                front = x;
            }
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
            out.push(x);
            while (!out.isEmpty()) {
                in.push(out.pop());
            }
        }

        public int pop() {
            int ans = in.pop();
            if (!in.empty()) {
                front = in.peek();
            }
            return ans;
        }

        public int peek() {
            return front;
        }

        public boolean empty() {
            return (in.isEmpty() && out.isEmpty());
        }
    }
}

//https://leetcode.com/problems/implement-queue-using-stacks/
