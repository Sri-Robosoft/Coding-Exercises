public class RemoveVowels {

    public static String removeVowelsInString(String str) {
        String s = "";
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c=='A' || c=='a' || c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u') 
                continue;
            else 
                s += str.charAt(i);
        }
        return s;
    }
    public static void main(String[] args) {
        String str = "HhfgDEAEShjknjhuiukHF";
        System.out.println("Original string is: " +str);
        System.out.println("String after removing all vowels is: " +removeVowelsInString(str));
    }
}
