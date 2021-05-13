package injecao_dependencia;

import java.util.Date;

public class Aluno extends Pessoa {

	private String matricula, cpf, email;
	private String dtnascimento;

	public Aluno(String nome, String email, String cpf, String matricula, String dtnasc) {
		this.setCpf(cpf);
		this.setDtnascimento(dtnasc);
		this.setEmail(email);
		this.setNome(nome);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDtnascimento() {
		return dtnascimento;
	}

	public void setDtnascimento(String dtnascimento) {
		this.dtnascimento = dtnascimento;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", cpf=" + cpf + ", email=" + email + ", dtnascimento=" + dtnascimento
				+ "]";
	}
	
	

}
