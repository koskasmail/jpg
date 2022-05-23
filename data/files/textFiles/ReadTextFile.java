
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

		public ReadTextFile()  {
		
		String relativePathFile = "log2.txt"; 
		
	
		try {
			BufferedReader reader = new BufferedReader(new FileReader(relativePathFile) );
			
//			System.out.println(reader.readLine() );
			
			String readOneLine;
			while( (readOneLine = reader.readLine()) != null) {
				System.out.println(readOneLine);
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
