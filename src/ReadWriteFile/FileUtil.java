package ReadWriteFile;

import java.io.*;

public class FileUtil {

    public void readWriteFile(String inFilePath, String outFilePath) {
        String readLine = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inFilePath));
             Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFilePath)))
        ) {
            while ((readLine = bufferedReader.readLine()) != null) {
                writer.write(readLine);
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("You got an error!");
            e.printStackTrace();
        }
    }
}


