package WagmiJava.Week5;
//Implement Stack using Arrays
public class ImplementStackUsingArrays {
    public class MyStack{
        int[] arr = new int[1000];
        int top = -1;

        public void push (int x){
            top = top + 1;
            arr[top] = x;
        }

        public int pop(){
            if (top == -1){
                return -1;
            }
            int temp = arr[top];
            top = top -1;
            return temp;
        }
    }
}
