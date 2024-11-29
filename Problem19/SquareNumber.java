package Problem19;

public class SquareNumber {
    public static void main(String[] args) {
        SquareNumberClass square = new SquareNumberClass();

        int num = 27;
        int result = square.checkNumberIsSquare(num);
        if(result==1001)
            System.out.println("Enter a positive number");
        else if(result==1)
            System.out.println("Given number " +num+ " is a square");
        else if(result==0)
            System.out.println("Given number " +num+ " is not a square");
    }
}
