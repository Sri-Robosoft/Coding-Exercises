package Problem20;

public class SumOfTwoSquares {
    public static void main(String[] args) {
        NumberSumOfTwoSquares num = new NumberSumOfTwoSquares();

        int sum = 102;
        boolean isSum = num.checkNumberSumOfTwoSquares(sum);

        if(isSum)
            System.out.println(sum +" is a sum of two squares");
        else
            System.out.println(sum +" is not a sum of two squares");

    }
}
