package Problem30;

public class StringReplace {
    public static String replaceSubstring(String str, String str1, String str2) {
        if (!str.contains(str1)) {
            return str;
        }
        return str.replaceAll(str1, str2);
    }

    public static void main(String[] args) {
        String originalString = "Mumbai";
        String substringToReplace = "Mum";
        String replacementString = "Du";

        String modifiedString = replaceSubstring(originalString, substringToReplace, replacementString);

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
}
