import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ThrowsExample {
	public static void main(String args[]) {
		FileWriter1.write("hello1.txt", "Hello file 1.");

		try {
			FileWriter2.write("hello2.txt", "Hello file 2.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// Bat ngoat le, xu li ngay trong ham
class FileWriter1 {
	public static void write(String fileName, String s) {
		try {
			File file = new File(fileName);
			PrintWriter out = new PrintWriter(file);

			out.println(s);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// Ne ngoai le (throws ...), Xu li ngoai le o noi goi phuong thuc nay (trong main)
class FileWriter2 {
	public static void write(String fileName, String s) throws FileNotFoundException {
		File file = new File(fileName);
		PrintWriter out = new PrintWriter(file);

		out.println(s);
		out.close();
	}
}