package Problem77;

public class StackUsingArray {

    public static boolean isStackFull(int top, int length) {
        return top == length-1;
    }

    public static boolean isStackEmpty(int top) {
        return top == -1;
    }

    public static int pushToArray(int elem, int top, int[] elementArray) {
        if(isStackFull(top, elementArray.length))
            System.out.println("Stack is Full");
        else
            elementArray[++top] = elem;

        return top;
    }

    public static int popFromArray(int top, int[] elementArray) {
        if(isStackEmpty(top))
            System.out.println("Stack is Empty");
        else {
            elementArray[top] = 0;
            top--;
        }

        return top;
    }

    public static void printStack(int top, int[] elementArray) {
        if(isStackEmpty(top))
            System.out.println("Stack is Empty");
        else {
            for(int i=0; i<=top; i++) {
                System.out.print(elementArray[i] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int stackSize = 3;
        int[] arr = new int[stackSize];
        int top = -1;

        try {
            popFromArray(top, arr);

            printStack(top, arr);

            top = pushToArray(3, top, arr);
            printStack(top,arr);
            top = pushToArray(4, top, arr);
            printStack(top,arr);
            top = pushToArray(5, top, arr);
            printStack(top,arr);

            top = pushToArray(6, top, arr);

            top = popFromArray(top, arr);
            printStack(top, arr);
            top = popFromArray(top, arr);
            printStack(top, arr);
            top = popFromArray(top, arr);
            printStack(top, arr);




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
