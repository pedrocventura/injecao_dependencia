package injecao_dependencia;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PersisteCSV implements Persiste {

	@Override
	public void persiste(Aluno pessoa) {
		FileWriter arq;
		try {
			arq = new FileWriter("pessoa.csv");
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.printf("%s;%s;%s;%s;%s\n", pessoa.getCpf(), pessoa.getNome(), pessoa.getDtnascimento(),pessoa.getEmail());
			arq.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
