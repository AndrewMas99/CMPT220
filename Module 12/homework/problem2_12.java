//Andrew Masone
/*
Write a program that reads words from a text file and displays all the nonduplicate words in ascending
order. The text file name is read from the user.
 */
//C:\\Users\\mason\\OneDrive\\Desktop\\Repositories\\cmpt220masone-Spring2023\\Module 12\\homework\\unique.txt


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class problem2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = input.nextLine();
        //String fileName = "C:\\Users\\mason\\OneDrive\\Desktop\\Repositories\\cmpt220masone-Spring2023\\Module 12\\homework\\unique.txt"; //Static way to instantly test a file with no input
        System.out.println();

                File file = new File(fileName);
        SortedSet<String> uniqueWords = new TreeSet<>();

        try {
            Scanner fileInput = new Scanner(file);
            while (fileInput.hasNext()) {
                String word = fileInput.next().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
                uniqueWords.add(word);
            }
            fileInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            System.exit(0);
        }

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
