package programm;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkWIthFile {


    public static void checkExistFile () {
        try {
            // define path
            Path path1 = Path.of("FromAlexeyToJoey/message.txt");
            // create parent directories
            Files.createDirectories(path1.getParent());
            // create if not exists
            if (Files.notExists(path1)) {
                Files.createFile(path1);
                System.out.println("File created");
            } else {
                System.out.println("File already exist");
            }
                } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


        public static void writeOnFile() {
        Path path = Path.of("FromAlexeyToJoey/message.txt");

        try {
            Files.createDirectories(path.getParent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fileWriter = new
                FileWriter("FromAlexeyToJoey/message.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("Hi, Joey!\n");
            bufferedWriter.write("Check out image methode! :)");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

        public static void readFromFile() {
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("FromAlexeyToJoey/message.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


    }
}
