import java.io.*;

public class FileIOwithCSV {
    public static void main (String [] args) throws IOException {
        System.out.println("\n\n Welcome to my File IO Demo\n\n");

        String pathname = "C:\\Users\\BE218\\Desktop\\text demo\\arrivingAnimals.txt";
        String pathOutput = "C:\\Users\\BE218\\Desktop\\text demo\\myNewFile.txt";
        BufferedReader reader = null;
        String line = ",";
        // Reader
        try {
            reader = new BufferedReader(new FileReader(pathname));
            while((line = reader.readLine()) != null ) {

                String[] row = line.split(",");

                for(String i : row) {
                    System.out.println(i);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
                reader.close();
                }

        // Writer
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathOutput));

        try {
            writer.write("This is a line of animals...");
            int i;
            for (i = 0; i < 10; i++) ;
            writer.write("\n i is: " + i);
        }

        catch (Exception e) {
            e.printStackTrace();

        }

        finally {
            writer.close();
        }

    }
}