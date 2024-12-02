public class EqualLengthString {

    public static String makeStringEqualLength(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();

        System.out.println("String 1 is: " +str1);
        System.out.println("String 2 is: " +str2);

        if(length1 > length2) 
            str1 = str1.substring(length1-length2);
        else if(length2 > length1)
            str2 = str2.substring(length2-length1);

        return str1+str2;
    }
    public static void main(String[] args) {
        String str1 = "Helkk";
        String str2 = "Hel";
        System.out.println("String "+str1+ " + String " +str2+ " is: " +makeStringEqualLength(str1, str2));
    }
}
