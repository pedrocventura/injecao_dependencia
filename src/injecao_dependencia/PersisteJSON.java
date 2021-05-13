package injecao_dependencia;

import java.io.FileWriter;

import com.google.gson.*;

public class PersisteJSON implements Persiste {

	@Override
	public void persiste(Aluno pessoa) {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		try {
			FileWriter writer = new FileWriter("pessoa.json");
			writer.write(gson.toJson(pessoa));
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
