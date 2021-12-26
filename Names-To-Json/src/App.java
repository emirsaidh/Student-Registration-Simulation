import java.io.File;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;
import java.io.FileWriter; 

public class App {
    public static void main(String[] args) throws Exception {
        try {
            File names = new File("C:\\Projects\\Java\\string to json\\src\\names.txt");
            File output = new File("C:\\Projects\\Java\\string to json\\src\\output.txt");
            
            Scanner myReader = new Scanner(names);
            FileWriter myWriter = new FileWriter(output);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);                           
                myWriter.write('"' + data + '"' + ",\n");
            }
            myReader.close();
            myWriter.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
