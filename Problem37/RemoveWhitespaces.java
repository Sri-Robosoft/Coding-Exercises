package Problem37;

public class RemoveWhitespaces {

    public static String removeWhitespacesInString(String str1) {
        StringBuilder str2 = new StringBuilder();

        if(str1.isEmpty())
            return null;

        for(int i=0; i<str1.length(); i++) {
            if(str1.charAt(i) != ' ')
                str2.append(str1.charAt(i));
        }
        return str2.toString().trim();
    }
    public static void main(String[] args) {
        String str =" Hey Hi   Hello  ";
        String result = removeWhitespacesInString(str);
        if(result != null)
            System.out.println("After removing whitespaces in string " +str+ "is: " + removeWhitespacesInString(str));
        else
            System.out.println("Entered string is empty");
    }
}
