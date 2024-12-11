package Problem80;

public class QueueUsingArray {

    public static boolean isEmpty(int front, int rear) {
        return front == rear;
    }

    public static boolean isFull(int front, int rear, int[] elementArray) {
        return rear == elementArray.length;
    }

    public static int enqueue(int num, int front, int rear, int[] elementArray) {
        if(isFull(front, rear, elementArray)) {
            System.out.println("Queue is full");
        }
        else {
            elementArray[rear++] = num;
        }
        return rear;
    }

    public static int dequeue(int front, int rear, int[] elementArray) {
        if(isEmpty(front, rear)) {
            System.out.println("Queue is empty");
        }
        else {
            front++;
        }
        return front;
    }

    public static void printQueue(int front, int rear, int[] elementArray) {
        if(isEmpty(front, rear)) {
            System.out.println("Queue is empty");
        }
        else {
            for(int i=front; i<rear; i++) {
                System.out.print(elementArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int queueSize = 4;
        int[] arr = new int[queueSize];
        int front = 0;
        int rear = 0;

        try {
            printQueue(front, rear, arr);

            rear = dequeue(front, rear, arr);

            rear = enqueue(5, front, rear, arr);
            printQueue(front, rear, arr);
            rear = enqueue(7, front, rear, arr);
            printQueue(front, rear, arr);
            rear = enqueue(9, front, rear, arr);
            printQueue(front, rear, arr);
            rear = enqueue(2, front, rear, arr);
            printQueue(front, rear, arr);

            rear = enqueue(8, front, rear, arr);
            printQueue(front, rear, arr);

            front = dequeue(front, rear, arr);
            printQueue(front, rear, arr);
            front = dequeue(front, rear, arr);
            printQueue(front, rear, arr);
            front = dequeue(front, rear, arr);
            printQueue(front, rear, arr);
            front = dequeue(front, rear, arr);
            printQueue(front, rear, arr);

            front = dequeue(front, rear, arr);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
