package SegundoSemestre;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exercicio30 {
	public static void main(String[] args) {
		
		FileReader file;
		
		BufferedReader buffer;
		
		String linha;
		
		String[] aux;
		
		double media;
		
		try {
			file = new FileReader("alunos");
			buffer = new BufferedReader(file);
			while((linha = buffer.readLine()) != null) {
				aux = linha.split(";");
				media = 0;
				for (int i = 1; i < aux.length; i++) {
					media += Double.parseDouble(aux[i]);
				}
				media = media / (aux.length - 1);
				System.out.println(media);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Erro ao abrir o arquivo!");
		}
		catch (IOException e) {
			System.out.println("Erro ao ler os dados do aquivo");
		}
		
	}

}