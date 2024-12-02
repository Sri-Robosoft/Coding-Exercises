public class StringLength {

    public static int findLengthOfString(String str, int len) {
        if(str.isEmpty())
            return len;

        return findLengthOfString(str.substring(1), len+1);
    }
    public static void main(String[] args) {
        String str = "Hello";
        int length = 0;
        length = findLengthOfString(str, length);
        System.out.println("Length of string " +str+ " is: " +length);
    }
}
