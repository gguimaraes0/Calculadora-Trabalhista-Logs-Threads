package Calculadora;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Log {

	public void LogErro(String mensagem, Categoria tipo,Exception ex) throws IOException
	{
		System.out.println(mensagem);
		String log = (tipo +" - "+ mensagem + " - " + ex);
		SalvarLog(log);
	}

	public void LogSucesso(String mensagem , Categoria tipo) throws IOException {
		System.out.println(mensagem);
		String log = (tipo +" - "+ mensagem);
		SalvarLog(log);
	}
	
	public void LogAviso(String mensagem , Categoria tipo) throws IOException {
		System.out.println(mensagem);
		String log = (tipo +" - "+ mensagem);
		SalvarLog(log);
	}

	public void SalvarLog(String mensagem) throws IOException {
		FileWriter arq = new FileWriter("log.txt");
		PrintWriter gravarArq = new PrintWriter(arq);		
		gravarArq.printf(mensagem);
		arq.close();
	}
}
