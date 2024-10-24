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
		int naoTriangulo = 0;
		
		try {
			file= new FileReader("triangulos.txt");
			buffer = new BufferedReader(file);
			
			while((linha = buffer.readLine()) != null) {
				temp = linha.split(";");
				x = Double.parseDouble(temp[0]);
				y = Double.parseDouble(temp[1]);
				z = Double.parseDouble(temp[2]);
				
				if(x < y + z && y < x + z && z < y + x) {
					if(x == y && y == z) {
						equilatero++;
					}
					else if(x == y || x == z ||  y == z) {
						isosceles ++;
					}
					else {
						escaleno++;
					}
				}
				else {
					naoTriangulo++;
				}
			}
			
		}
		catch (FileNotFoundException e) {
			System.out.println("Erro ao abrir o arquivo");
		}
		catch (IOException e) {
			System.out.println("Erro ao ler dados do arquivo");
		}
		
		System.out.println("Total de equilateros: " + equilatero);
		System.out.println("Total de isósceles: " + isosceles);
		System.out.println("Total de escalenos: " + escaleno);
		System.out.println("Total de não triângulos: " + naoTriangulo);
		
		
		
	}

}
