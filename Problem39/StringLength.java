package Problem39;

public class StringLength {

    public static int findLengthOfString(String str, int length) {
        int i = 0;
        char characterInString;

        while (i >= 0) {
            try {
                characterInString = str.charAt(i);
                length++;
                i++;
            } catch (Exception e) {
                break;
            }
        }
        return length;
    }
    public static void main(String[] args) {
        String str = "Hello ";
        int initialLength = 0;
        System.out.println("Length of string " +str+ " is: " +findLengthOfString(str, initialLength));
    }
}
