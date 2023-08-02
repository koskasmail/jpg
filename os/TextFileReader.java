
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {

	public static TextFileObject readFile(String filePath) {
		TextFileObject fileObject = new TextFileObject();

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			StringBuilder content = new StringBuilder();

			while ((line = reader.readLine()) != null) {
				content.append(line).append("\n");
			}

			fileObject.setContent(content.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return fileObject;
	}

	public TextFileReader() {
		// String filePath = "c:\temppath/to/text.txt";
		String filePath = "C:\\Temp\\test.txt";
		TextFileObject fileObject = readFile(filePath);
		System.out.println(fileObject.getContent());
	}
}

class TextFileObject {
	private String content;

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}
