package Problem48;

import java.io.*;

public class CountOfCharactersWordsLines {

    public static void findCountOfCharactersWordsLineInFile(String url) throws IOException {
        String line; 
        int wordCount = 0; 
        int characterCount = 0; 
        int lineCount = 0;

        File file1 = new File(url);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file1));

        writer.write("Hello World");
        writer.newLine();
        writer.write("Good");
        writer.newLine();
        writer.write("Morning Helios");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader(file1)); 

         while ((line = reader.readLine()) != null) { 
            lineCount++;
            characterCount += line.length(); 
            String words[] = line.split("\\s+"); 
            wordCount += words.length; 
        } 
        reader.close();

        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + characterCount);

    }
    public static void main(String[] args) {
        try {
            findCountOfCharactersWordsLineInFile("javaFile.txt");
        } catch (IOException e) {
            e.toString();
        }
    }
}
