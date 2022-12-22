package programm;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainApp {
    public static void main(String[] args) {

        //1
        WorkWIthFile.checkExistFile();
        //2
//        WorkWIthFile.writeOnFile();
        //3
//        WorkWIthFile.readFromFile();
        //4
//        Image.imageIoWrite();


        //5
//        Animal animal1 = new Animal("Lion", true);
//
//        Path path = Path.of("FromAlexeyToJoey/animal.txt");
//        File file = path.toFile();
//
//        if (!Files.exists(path.getParent())) {
//            try {
//                Files.createDirectories(path.getParent());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
//                new FileOutputStream("FromAlexeyToJoey/animal.txt"))) {
//            objectOutputStream.writeObject(animal1);
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        }
//
//        try (ObjectInputStream objectInputStream = new ObjectInputStream(
//                new FileInputStream("FromAlexeyToJoey/animal.txt"))) {
//            Animal myAnimal;
//            while ((myAnimal = (Animal) objectInputStream.readObject()) != null) {
//                System.out.println(myAnimal);
//            }
//        } catch (EOFException eofException) {
//            System.out.println("Reached the end of the file.");
//        } catch (IOException | ClassNotFoundException exception) {
//            exception.printStackTrace();
//        }

    }
}
