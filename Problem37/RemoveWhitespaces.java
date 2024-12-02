public class RemoveWhitespaces {

    public static String removeWhitespacesInString(String str1) {
        String str2 = "";

        for(int i=0; i<str1.length(); i++) {
            if(str1.charAt(i) == ' ')
                continue;
            else
                str2 += str1.charAt(i);
        }

        return str2.trim();
    }
    public static void main(String[] args) {
        String str =" Hey Hi Hello  ";
        System.out.println("After removing whitespaces in string " +str+ "is: " + removeWhitespacesInString(str));
    }
}
