class Stack {
    int[] arr;
    int top;

    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return arr[top--];
    }

    public void display() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Queue {
    int[] arr;
    int front, rear;

    public Queue(int size) {
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear == arr.length - 1) {
            System.out.println("Queue Overflow!");
            return;
        }
        arr[++rear] = value;
    }

    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        return arr[front++];
    }

    public void display() {
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class StackDemo{
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Popped: " + stack.pop());
        stack.display();

        System.out.println();

        Queue queue = new Queue(5);
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
    }
}
