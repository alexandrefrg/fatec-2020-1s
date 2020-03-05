package edu.curso;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSocketTeste {
	public ServidorSocketTeste() throws IOException {
		ServerSocket srv = new ServerSocket(3000);
		System.out.println("Servidor criado e aguardando conexão do cliente");
		Socket cliente = srv.accept();
		System.out.println("Cliente conectou com sucesso");
		String msg = "\n-----------------------------------------------"
				+ "\nOla, bem vindo ao servidor Java!               "
				+ "\nEscreva sua mensagem, envie teclando ENTER     "
				+ "\nCaso queira sair digite ESC precedido de ENTER "
				+ "\n-----------------------------------------------" + "\n";
		OutputStream out = cliente.getOutputStream();
		InputStream in = cliente.getInputStream();
		out.write(msg.getBytes());
		out.flush();
		boolean sair = false;
		while (!sair) {
			if (in.available() > 0) {
				int i = in.read();
				System.out.print((char) i);
				if (i == 27) {
					msg = "Você digitou ESC e sua conexão será encerrada!";
					out.write(msg.getBytes());
					out.flush();
					sair = true;
				}
			}
		}
		cliente.close();
	}

	public static void main(String[] args) throws IOException {
		new ServidorSocketTeste();
	}
}
