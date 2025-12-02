package demo.demo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Seperate_Pdf_Name_Wise_From_Failure {
    public static void main(String[] args) {
    	System.out.println("running");
        String filePath = "/home/raghib/Documents/sm-bsa-test-format-wise-files/failureresults.txt"; // txt folder path
        String readPdfPath = "/home/raghib/Documents/BOI"; //total pdf of bank
        String destinationFolder = "/home/raghib/Downloads/ilovepdf_split-range (28)"; // Provide the actual destination path
        System.out.println("/home/raghib/Downloads/ilovepdf_split-range (12)");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String originalFileName = line.split("PDF/")[1].split(".pdf")[0].trim()+".pdf";

                // Assuming the PDF file names do not contain any spaces or special characters

                // Create Path objects for source and destination files
                Path sourcePath = Paths.get(readPdfPath, originalFileName);
                Path destinationPath = Paths.get(destinationFolder, originalFileName);

                // Copy the file if it exists
                if (Files.exists(sourcePath)) {
                    Files.copy(sourcePath, destinationPath,StandardCopyOption.REPLACE_EXISTING );
                    System.out.println("Copied: " + originalFileName);
                } else {
                    System.out.println("File not found: " + originalFileName);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
