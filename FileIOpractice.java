import java.io.*;
import java.io.IOException;

public class FileIOpractice {
    public static void main(String [] args) throws IOException {
        System.out.println("\n Welcome to Java IO");

        try {
            // Create a file writer and open it.
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\BE218\\Downloads\\java stuff\\myNewFile.txt"));

            // Write to the file using the writer
            writer.write("This is the first line in my new file!");
            writer.write("\n This is on a new line");
            writer.write("\n This is a string and it is my third line");

            // Close the file.
            writer.close();

            // What did the program write?
            System.out.println("\n I just wrote a file!");

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\BE218\\Downloads\\java stuff\\myNewFile.txt"));
            String myLine = "";
            while ((myLine = reader.readLine()) != null) ;
            System.out.println(myLine);
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // Open a csv file using the split() method in a string object

        String path = "C:\\Users\\BE218\\Downloads\\java stuff\\arrivingAnimals.txt";
        String myFineLine = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((myFineLine = reader.readLine()) != null) ;
            System.out.println(myFineLine); {
                String [] myArray = myFineLine.split ( regex: ",");
                System.out.println(" First Item: " + myArray [0]);
                System.out.println(" Second Item: " + myArray [1]);
                System.out.println(" Third Item: " + myArray [2]);
                System.out.println(" Fourth Item: " + myArray [3]);

            }
        }


    }
}