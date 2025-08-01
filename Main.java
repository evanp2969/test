import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    private Scanner scanner;
    private int[] numbers = new int[10];
    public static void main(String[] args){

        Main main = new Main();

        main.scanner = new Scanner(System.in);

        System.out.println("Number Sort Program");
        System.out.println("Loading numbers.txt");
        main.loadNumbers();
        System.out.println("- Numbers Loaded -");
        System.out.println("Welcome to the Number Sort Program, please set program...");
        System.out.println("1. Number Sorting");

        main.programSetter();

    }

    private void programSetter(){
        int progSet = scanner.nextInt();

        switch(progSet){
            case 1:
                CommandApp app = new NumberSort();
                app.run(numbers);
            break;

        }


    }

    private void loadNumbers(){
        String fileName = "numbers.txt";

        try {
            // Create a File object representing the text file
            File file = new File(fileName);

            // Create a FileReader to read characters from the file
            FileReader fileReader = new FileReader(file);

            // Create a Scanner to parse the input from the FileReader
            Scanner scanner = new Scanner(fileReader);

            // Read the file line by line
            int i = 0;
            while (scanner.hasNextLine()) {
                
                if(i >= 9){
                    System.out.println("!Number Count Exceeded!");
                    break;
                }
                String line = scanner.nextLine();
                //System.out.println(line); // Print each line to the console

                numbers[i] = Integer.parseInt(line);
                i++;
            }

            // Close the scanner and file reader to release resources
            scanner.close();
            fileReader.close();
            

        } catch (IOException e) {
            // Handle potential IOException (e.g., file not found)
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public int[] getNumbers(){
        return numbers;
    }


}