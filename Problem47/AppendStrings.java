package Problem47;

public class AppendStrings {

    public static String appendTwoStrings(String str1, String str2) {
        if (str1.isEmpty())
            return str2;
        if (str2.isEmpty())
            return str1;

        while(true) {
            if(str1.charAt(str1.length()-1) == str2.charAt(0))  {
                str1 = str1.substring(0, str1.length()-1);
            }
            else {
                break;
            }
        }
        return str1 + str2;
    }
    public static void main(String[] args) {
        String str1 = "Heyyyy";
        String str2 = "yHey";
        System.out.println("Final string fter appending strings " +str1+ " and " +str2+ " is: " +appendTwoStrings(str1, str2));
    }
}