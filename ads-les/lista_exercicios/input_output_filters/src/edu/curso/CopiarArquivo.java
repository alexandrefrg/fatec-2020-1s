package edu.curso;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class CopiarArquivo {
	public static void main(String[] args) throws Exception {
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new File(System.getProperty("user.home")));
		int result = fc.showOpenDialog(fc);
		File oldFile = new File("");
		if (result == JFileChooser.APPROVE_OPTION) {
			oldFile = fc.getSelectedFile();
		}
		String path = oldFile.getParentFile() + "/";
		String newFile = JOptionPane.showInputDialog("Qual o nome do arquivo que você deseja criar");
		JOptionPane.showMessageDialog(null, String.format("O novo arquivo foi gravado em: " + path + newFile));
	}
}
