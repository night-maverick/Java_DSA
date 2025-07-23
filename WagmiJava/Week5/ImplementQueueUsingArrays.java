package WagmiJava.Week5;
//Implement Queue using Arrays
public class ImplementQueueUsingArrays {
    public class MyQueue{
        int front = 0;
        int rear = 0;
        int[] arr = new int[100005];

        public void push (int x){
            arr[rear] = x;
            rear = (rear + 1) % arr.length;
        }

        public int pop(){
            if (front == rear){
                return -1;
            }
            int temp = arr[front];
            front = (front +1) % arr.length;
            return temp;
        }
    }
}
