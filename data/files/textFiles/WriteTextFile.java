
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public WriteTextFile() {
		
		String [] names = {"yifat", "shalom", "jaron"};
		
		String relativePathFile = "log2.txt"; 
		String absolutePathFile = "C:\\00-util\\log2.txt";
		try {					
			BufferedWriter writer = new BufferedWriter(new FileWriter(relativePathFile));
			writer.write("line #1");
			writer.write("\n");
			writer.write("line #2");
			writer.write("\n");
			
			for (String name: names) {
				writer.write(name + ", ");
			}
			
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
