package injecao_dependencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno pessoa = new Aluno("Pedro", "pedro.cventura@hotmail.com", "08485949676", "123", "16/06/2000" );
		
		Persiste persiste = new PersisteJSON();
		persiste.persiste(pessoa);
		
		persiste = new PersisteCSV();
		persiste.persiste(pessoa);
		
		

	}

}
