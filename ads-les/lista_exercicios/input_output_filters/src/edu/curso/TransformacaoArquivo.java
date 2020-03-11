package edu.curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TransformacaoArquivo {
	public static void main(String[] args) {
		try {
			File a = new File("/home/ale/Downloads/a.csv");
			FileReader fr = new FileReader(a);
			BufferedReader reader = new BufferedReader(fr);

			String linha = reader.readLine();
			String conteudo = new String();
			while (linha != null) {
				String[] aluno = linha.split(";");
				String nmAluno = aluno[0];
				Float notaAluno = Float.parseFloat(aluno[1].replace(',', '.')) + 1;
				conteudo += nmAluno + "; " + notaAluno.toString().replace('.', ',') + "\n";

				linha = reader.readLine();
			}
			fr.close();

			File b = new File("/home/ale/Downloads/b.csv");
			FileWriter fw = new FileWriter(b);
			fw.write(conteudo);
			fw.flush();
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}