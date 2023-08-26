import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileScreen{
	public static void main(String args[]) throws IOException{
		FileInputStream fin;
		int c;
		try{
			fin = new FileInputStream(args[0]);
			do{
				c = fin.read();
				if(c != -1) System.out.print((char) c);
			} while(c != -1);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}
	}
}