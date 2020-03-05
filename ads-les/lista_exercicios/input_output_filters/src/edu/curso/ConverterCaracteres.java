package edu.curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConverterCaracteres {
	public static void main(String[] args) {
//		File f = new File("C:/texto.txt");
		File f = new File("/home/ale/Downloads/texto.txt");
		char[] charArray = { 'I', 'Z', 'E', 'A', 'S', 'G', 'T', 'B', 'q', 'O' };
		char[] charTroca = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
		try {
			FileWriter fw = new FileWriter(f);
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(in);
			System.out.println("Digite um nome, quando quiser finalizar digite sair");
			String nome = "";
			while (!nome.equals("sair")) {
				nome = reader.readLine();
				if (nome.equals("sair"))
					fw.close();
				else {
					String nomeAlterado = new String();
					int cont = 0;
					for (char c : charArray) {
						if (nome.indexOf(c) != -1) {
							nomeAlterado = nome.replaceAll(Character.toString(charArray[cont]),
									Character.toString(charTroca[cont]));
						}
						cont++;
					}
					if (!nomeAlterado.isEmpty())
						nome = nomeAlterado;
					fw.write(nome + "\n");
					fw.flush();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
