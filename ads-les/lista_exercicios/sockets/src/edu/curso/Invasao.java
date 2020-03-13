package edu.curso;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Invasao {
	private static final int PORTA = 1110;
	private static final String PREFIX_IP = "172.16.168.";
	private static final String MENSAGEM = "[ATTACK DISABLED]\n[UNLOCK SYSTEM]";

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket cliente = null;
		for (int i = 0; i < 256; i++) {
			cliente = new Socket(PREFIX_IP + i, PORTA);
			OutputStream out = cliente.getOutputStream();
			OutputStreamWriter out_writer = new OutputStreamWriter(out);
			out_writer.write(MENSAGEM);
			cliente.close();
		}
	}
}
