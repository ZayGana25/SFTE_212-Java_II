package Programming_Assignments.PA4;

import java.io.*;

public class Lugo_PA4 {
    public static void main(String[] args) throws IOException {
        System.out.println("Buffered Writer/Reader in Java");
       
        // write to file path a string

        File fileName = new File("/Users/Isaia/Desktop/Bushnell_Computer_Science/SFTE_212_Java_II/Programming_Assignments/PA4/Lugo_PA4.txt");
        FileWriter fileWriter = new FileWriter(fileName);
        try (BufferedWriter  bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("My name is Isaiah Lugo and I attend Bushenll University as a Software Engineer major.");
            bufferedWriter.close();
        }

        // read a character in the string file path

        FileReader fileReader = new FileReader(fileName);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            int eachCharacter;
            int aCount = 0;
            while ((eachCharacter = bufferedReader.read()) != -1) {
                if (eachCharacter == 'i') {
                aCount++;
                }
            }
            bufferedReader.close();
            System.out.println("There are " + aCount + " lower case 'i' characters in " + fileName);
        }

    }
}
