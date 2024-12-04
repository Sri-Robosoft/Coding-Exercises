package Problem44;

public class PercentageOfCharacters {

    public static void findPercentageOfCharactersInString(String str) {
        if(str.isEmpty())
            System.out.println("String is null");

        float lowerCount = 0;
        float upperCount = 0;
        float digitCount = 0;
        float specialCharacterCount = 0;

        for(int i=0; i<str.length(); i++) {
            int asciiCode = (int) str.charAt(i);

            if(asciiCode>96 && asciiCode<123)
                lowerCount++;
            else if(asciiCode>64 && asciiCode<91)
                upperCount++;
            else if(asciiCode>47 && asciiCode<58)
                digitCount++;
            else
                specialCharacterCount++;
        }

        System.out.println("Percentage of lower case letters in string " +str+ " is: " +String.format("%.2f", (lowerCount*100)/str.length())+"%");
        System.out.println("Percentage of upper case letters in string " +str+ " is: " +String.format("%.2f", (upperCount*100)/str.length())+"%");
        System.out.println("Percentage of digits in string " +str+ " is: " +String.format("%.2f", (digitCount*100)/str.length())+"%");
        System.out.println("Percentage of special characters in string " +str+ " is: " +String.format("%.2f", (specialCharacterCount*100)/str.length())+"%");
    }
    public static void main(String[] args) {
        String str = "Hih(&^%#$hBJBB265*^6646h";
        findPercentageOfCharactersInString(str);
    }
}