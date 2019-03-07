package ReadWriteFile;

// Farcas Iosif

public class Main {
    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();
        fileUtil.readWriteFile("src/InputFile.txt", "src/OutputFile.txt");
    }
}
