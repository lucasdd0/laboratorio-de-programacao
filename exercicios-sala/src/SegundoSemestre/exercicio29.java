package SegundoSemestre;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class exercicio29 {
	public static void main(String[] args) throws IOException {
		
		FileReader file;
		
		BufferedReader buffer;
		
		String linha;
		
		file = new FileReader("d:\\sis\\exemplo.txt");
		buffer = new BufferedReader(file);
		
		while((linha = buffer.readLine()) != null) {
			System.out.println(linha);
		}
	}

}
