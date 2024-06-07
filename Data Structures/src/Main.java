public class Main {
    public static void main(String[] args) {
        // Create a stack with a capacity of 10
        Stack stack = new Stack(10);

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();
        stack.pop();
        stack.pop();

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is stack full? " + stack.isFull());

        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("Is stack empty? " + stack.isEmpty());

        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }

        System.out.println("Is stack full? " + stack.isFull());
        System.out.println("Popped element: " + stack.pop());
    }

}