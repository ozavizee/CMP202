public class Stack {

    public static void main(String[]args){
    private int size;
    private int top;
    private int[] stack;

    public Stack(int capacity) {
        top = -1;
        size = capacity;
        stack = new int[size];
    }

    public boolean isFull(){
        return (top == size - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

        public void push(int item) {
            if (isFull()) {
                System.out.println("Stack is full");
            } else {
                stack[++top] = item;
            }
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return 0;
            } else {
                return stack[top--];
            }
        }

        public static void main(String[] args) {
            Stack myStack = new Stack(5);
            myStack.push(10);
            myStack.push(20);
            myStack.push(30);

            System.out.println("Popped item: " + myStack.pop());
        }
    }
