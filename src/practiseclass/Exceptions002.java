package practiseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions002 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		 try {
	             fis = new FileInputStream("C:\\Users\\Sersefil\\eclipse-workspace\\winterjava01\\src\\practiseclasskubrasayli\\Exception");
	            
	            int k;
	            while((k = fis.read())!=-1) {
	                System.out.print( (char) k);
	            }
		 	} catch (FileNotFoundException e) {
	        
	            System.out.println("The path is wrong or file deleted");
	        } catch (IOException e) {
	            System.out.println("The file could not be read");
	        }
		 try {
			fis.close();
		} catch (IOException e) {
			System.out.println("The file could not be closed");
		}
	}

}
