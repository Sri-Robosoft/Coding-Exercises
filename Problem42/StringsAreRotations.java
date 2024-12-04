package Problem42;

public class StringsAreRotations {

    public static boolean checkStringsAreRotations(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;

        for(int i=0; i<str1.length(); i++) {
            if(str1.equalsIgnoreCase(str2))
                return true;
            str2 = str2.charAt(str2.length()-1) + str2.substring(0,str2.length()-1);
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "dabc";

        boolean areRotations = checkStringsAreRotations(str1, str2);
        if(areRotations)
            System.out.println(str1+ " and " +str2+ " are rotations");
        else 
            System.out.println(str1+ " and " +str2+ " are not rotations");
    }
}
