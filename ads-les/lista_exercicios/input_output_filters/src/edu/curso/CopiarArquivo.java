package edu.curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CopiarArquivo {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		try {
			System.out.println("Digite o nome do arquivo origem:");
//			String nmArqOrigem = "/home/ale/Downloads/arqOrigem.txt";
			String nmArqOrigem = reader.readLine();

			System.out.println("Digite o nome do arquivo destino:");
//			String nmArqDestino = "/home/ale/Downloads/arqDestino.txt";
			String nmArqDestino = reader.readLine();

			File arqOrigem = new File(nmArqOrigem);
			FileReader fr = new FileReader(arqOrigem);
			BufferedReader readerArq = new BufferedReader(fr);

			File arqDestino = new File(nmArqDestino);
			FileWriter fw = new FileWriter(arqDestino);

			String linha = readerArq.readLine();
			String conteudo = new String();
			while (linha != null) {
				conteudo += linha + "\n";
				linha = readerArq.readLine();
			}
			fr.close();

			fw.write(conteudo);
			fw.flush();
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
