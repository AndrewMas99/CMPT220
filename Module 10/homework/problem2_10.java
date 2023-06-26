//Andrew Masone
/*
Write a Java program that asks the user to enter text and then stores the text in a file. The name of
the output file should be output.txt.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class problem2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to append: (Y) (N)");
        String YesNo = input.nextLine();
        boolean app;
        app = Objects.equals(YesNo, "Y");
        System.out.print("Enter text: ");
        String text = input.nextLine();
        File file = new File("output.txt");



        try {
            FileWriter writer = new FileWriter(file, app); // App set true means appending to file, else it will overwrite
            writer.write(text);
            writer.close();
            System.out.println("Text added to file.");
        } catch (IOException except) {
            System.out.println("An error occurred while writing to the file.");
            except.printStackTrace();
        }
        //System.out.println(app);//
    }
}

