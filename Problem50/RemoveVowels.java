package Problem50;

public class RemoveVowels {

    public static String removeVowelsInString(String str) {
        StringBuilder s = new StringBuilder();

        if(str.isEmpty())
            return null;

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c=='A' || c=='a' || c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u')
                continue;
            else
                s.append(str.charAt(i));
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String str = "HhfgDEAEShjknjhuiukHF";
        System.out.println("Original string is: " +str);
        String result = removeVowelsInString(str);
        if(result != null)
            System.out.println("String after removing all vowels is: " +removeVowelsInString(str));
        else
            System.out.println("Entered string is empty");
    }
}
