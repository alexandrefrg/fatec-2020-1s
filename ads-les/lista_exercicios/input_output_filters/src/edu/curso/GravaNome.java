package edu.curso;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GravaNome {
	public static void main(String[] args) {
//		File f = new File("C:/nome.txt");
		File f = new File("/home/ale/Downloads/nome.txt");
		try {
			FileWriter fw = new FileWriter(f);
			fw.write("Alexandre Freire Garcia");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
