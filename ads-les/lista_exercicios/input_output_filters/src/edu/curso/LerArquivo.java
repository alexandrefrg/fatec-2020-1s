package edu.curso;

import java.io.File;
import java.io.FileReader;

public class LerArquivo {
	public static void main(String[] args) {
		try {
//			File f = new File("C:/Windows/setuplog.txt");
			File f = new File("/home/ale/Downloads/lista.txt");
			FileReader fr = new FileReader(f);
			int i = 0;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
