package Problem38;

public class InsertStringInBetweenString {

    public static String insertString(String str1, String str2, int index) { 
        StringBuilder str3 = new StringBuilder();
  
        for (int i = 0; i < str1.length(); i++) { 
            if (i == index) { 
                str3.append(str2);
            } 
            str3.append(str1.charAt(i));
        }
         return str3.toString();

		// String str3 = str1.substring(0, index) + str2 + str1.substring(index); 
		// return str3;

        // StringBuffer str3 = new StringBuffer(str1); 
        // str3.insert(index, str2); 
        // return str3.toString(); 
	} 
	
	public static void main(String[] args) { 
		String str1 = "HelloMorning"; 
		String str2 = "*Good*"; 
		int index = 5; 

		System.out.println("Original String: "+ str1); 
		System.out.println("String to be inserted: "+ str2); 
		System.out.println("String to be inserted at index: "+ index); 

		System.out.println("Modified String: "+ insertString(str1, str2, index)); 
	} 
} 