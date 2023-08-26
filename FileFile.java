import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileFile{
	public static void main(String args[]) throws IOException{
		FileInputStream fin;
		FileOutputStream fout;
		int c;
		try{
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);
			do{
				c = fin.read();
				if(c >= 48 && c <= 57) fout.write((char)c);
			} while(c != -1);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}
	}
}