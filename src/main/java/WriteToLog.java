import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteToLog {

    private static WriteToLog instance;

    private WriteToLog() {
    }

    public static WriteToLog getInstance(){
        if (instance == null) {
            instance = new WriteToLog();
        }
        return instance;
    }

    public void getTextAndWriteToLog(String someText) throws IOException {
        String fileName = "src/main/resources/log.txt";
        String messageToWrite = someText;
        Files.writeString(Paths.get(fileName), messageToWrite + System.lineSeparator(), StandardCharsets.ISO_8859_1, StandardOpenOption.APPEND);
    }
}
