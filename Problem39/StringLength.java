package Problem39;

public class StringLength {

    public static int findLengthOfString(String str, int length) {
        if(str.isEmpty())
            return length;

        return findLengthOfString(str.substring(1), length+1);
    }
    public static void main(String[] args) {
        String str = "Hello ";
        int initialLength = 0;
        int length = findLengthOfString(str, initialLength);
        System.out.println("Length of string " +str+ " is: " +length);
    }
}
