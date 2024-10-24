package SegundoSemestre;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exercicio31 {
	public static void main(String[] args) {
		
		FileReader file;
		BufferedReader buffer;
		String linha;
		String[] temp;
		double x, y, z;
		int equilatero = 0, escaleno = 0, isosceles = 0;
		
		try {
			file= new FileReader("triangulos.txt");
			buffer = new BufferedReader(file);
			
			while((linha = buffer.readLine()) != null) {
				temp = linha.split(";");
				x = Double.parseDouble(temp[0]);
				y = Double.parseDouble(temp[1]);
				z = Double.parseDouble(temp[2]);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Erro ao abrir o arquivo");
		}
		catch (IOException e) {
			System.out.println("Erro ao ler dados do arquivo");
		}
		
		
		
	}

}
