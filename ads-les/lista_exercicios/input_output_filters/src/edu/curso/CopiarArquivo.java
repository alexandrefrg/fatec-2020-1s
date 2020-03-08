package edu.curso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CopiarArquivo {
	public static void main(String[] args) throws Exception {
//		JFileChooser fc = new JFileChooser();
//		fc.setCurrentDirectory(new File(System.getProperty("user.home")));
//		int result = fc.showOpenDialog(fc);
//		File oldFile = new File("");
//		if (result == JFileChooser.APPROVE_OPTION) {
//			oldFile = fc.getSelectedFile();
//		}
//		String path = oldFile.getParentFile() + "/";
//		String newFile = JOptionPane.showInputDialog("Qual o nome do arquivo que você deseja criar");
//		JOptionPane.showMessageDialog(null, String.format("O novo arquivo foi gravado em: " + path + newFile));
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		
		System.out.println("Digite o nome do arquivo origem:");
		String nmArqOrigem = "/home/ale/Downloads/arqOrigem.txt";//reader.readLine();
		
		System.out.println("Digite o nome do arquivo destino:");
		String nmArqDestino = "/home/ale/Downloads/arqDestino.txt";//reader.readLine();
		
		File arqOrigem = new File(nmArqOrigem);
		FileReader fr = new FileReader(arqOrigem);
		BufferedReader readerArq = new BufferedReader(fr);
		
		File arqDestino = new File(nmArqDestino);
		FileWriter fw = new FileWriter(arqDestino);
		BufferedWriter writerArq = new BufferedWriter(fw);
		
		String linha = readerArq.readLine();
		String conteudo = new String();
		while (linha != null) {
			conteudo += linha + "\n";
			linha = readerArq.readLine();
		}
		fr.close();
		
		System.out.println(writerArq.toString());
		
		fw.write(conteudo);
		fw.flush();
		fw.close();
	}
}
