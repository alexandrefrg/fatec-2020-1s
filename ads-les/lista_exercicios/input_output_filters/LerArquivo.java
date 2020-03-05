package edu.curso;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
	public static void main(String[] args) {
//		File f = new File("C:/Windows/setuplog.txt");
		File f = new File("/home/ale/Downloads/lista.txt");
		try {
			FileReader fr = new FileReader(f);
			int i = 0;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
