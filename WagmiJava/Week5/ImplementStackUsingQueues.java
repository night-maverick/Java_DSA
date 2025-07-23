package WagmiJava.Week5;

import java.util.Queue;

//https://leetcode.com/problems/implement-stack-using-queues/
public class ImplementStackUsingQueues {
    public class MyStack {
        Queue<Integer> queue;
        public void push(int x) {
            queue.add(x);
            for (int i = 0; i < queue.size(); i++) {
                queue.add(queue.poll());
            }

        }

        public int pop() {
            return queue.remove();
        }

        public int top() {
            return queue.element();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }


}
