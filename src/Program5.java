import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// Manipulando pastas e arquivos
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a folder path: ");
		String strPath = sc.next();
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		for (File folder: folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		for (File file: files) {
			System.out.println(file);
		}
		try {
		//Criando arquivo
		boolean successFile = new File(strPath + "\\teste2.txt").createNewFile();
		System.out.println("File created successfully: "+ successFile);
		//Criando arquivo
	    boolean successFolder = new File(strPath + "\\teste").mkdir();
		System.out.println("Directory created successfully: "+ successFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
