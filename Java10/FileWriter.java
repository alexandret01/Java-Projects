package Java10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter {

	public static void main(String[] args) {
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		String path = "/home/alexandre/Downloads/new.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
