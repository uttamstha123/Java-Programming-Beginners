import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\helloWorld.txt");
		Scanner sc = new Scanner(file);
//		System.out.println(sc.nextLine());
		// To copy the content into another file
		// We Use something called FileWriter
		FileWriter fw = new FileWriter("C:\\Users\\hp\\Desktop\\newfile.txt");
		String fileContent = "";
		while(sc.hasNextLine()) {
			fileContent += fileContent.concat(sc.nextLine()+"\n");
		}
		fw.write(fileContent);
		fw.close();
	}
}
