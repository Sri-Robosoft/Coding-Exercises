package Problem15;

public class Reverse {
    public static void main(String[] args) {
        ReverseNumber rev = new ReverseNumber();

        int num = 125;
        int reversedNumber = rev.reverseGivenNumber(num);
        if(reversedNumber == 1001)
            System.out.println("Please enter a number greater than 9 to get result of reversing it");
        else
            System.out.println("Reverse of " +num+ " is: " +reversedNumber);
    }
}


