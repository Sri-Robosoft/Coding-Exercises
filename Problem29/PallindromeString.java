package Problem29;

public class PallindromeString {

    private String reverseString(String str) {
        if(str.length() == 1) {
            return str;
        }
        return str.charAt(str.length()-1) + reverseString(str.substring(0,str.length()-1));
    }

    public void checkPallindromeString(String str) {
        if(str.equalsIgnoreCase(reverseString(str)))
            System.out.println("String is a pallindrome");
        else
            System.out.println("String is not a pallindrome");
    }
}
