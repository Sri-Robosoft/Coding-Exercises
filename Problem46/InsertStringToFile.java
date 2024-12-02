import java.io.*;

public class InsertStringToFile {

    public static void createInsertStringToFile(String filename, String data) throws IOException {
        File sampleFile = new File(filename);
        BufferedWriter writer = new BufferedWriter(new FileWriter(sampleFile));
        writer.write(data);
        writer.close();
    }
    public static void main(String[] args) {
        try {
            createInsertStringToFile("Sample.txt", "Hello World");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
