import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) {
		// Criando e escrevendo em arquivos com BufferWriter e FileWriter
		String[] lines = new String[] {"Good Morning!","Good afternoon!", "Good night!"};
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String line: lines) {
				bw.write(line);
				bw.newLine();
			}
			bw.write("Fim do arquivo.");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
