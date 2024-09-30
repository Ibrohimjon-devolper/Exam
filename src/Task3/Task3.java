package Task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {

        System.out.println("Qaysi folderdan qidirish kerak");
        String SearchFolder = scanner.nextLine();

        String FoundFinalFile = "Password.txt";
        String finalName = null;
        String foundFile = null;

        List<Path> walk = Files.walk(Path.of(SearchFolder)).toList();
        for (Path path : walk) {
            if (Files.isRegularFile(path)) {
                foundFile = String.valueOf(path.getFileName());
                if (foundFile.equals(FoundFinalFile)){
                    finalName= String.valueOf(path);
                    break;
                }

            }
        }


        System.out.println("foundFile = " + finalName);
        Path path1 = Path.of(finalName);

        byte[] bytes = Files.readAllBytes(path1);
        String passwords = new String(bytes);
        String q1 = "\\b[a-zA-Z0-9]{8}\\b";
        Pattern pattern = Pattern.compile(q1);


        Matcher matcher1 = pattern.matcher(passwords);
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }

    }

}
