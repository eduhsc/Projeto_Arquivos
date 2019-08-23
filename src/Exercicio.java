import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercicio {

	public static void main(String[] args) {
		
		String pathOrigem = "c:\\temp\\origem.csv";
		String pathDestino ="c:\\temp\\destino.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(pathOrigem))) {
			String line = br.readLine();
			String[] vet;
			List<String> produtos = new ArrayList<>();
			while (line != null) {
				vet = line.split(",");
				double total = Double.parseDouble(vet[1])*Double.parseDouble(vet[2]);
				produtos.add(vet[0]+","+total);
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathDestino))){
					for (String row: produtos) {
						bw.write(row);
						bw.newLine();
					}
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}

	}

}
