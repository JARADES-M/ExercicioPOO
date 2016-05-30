/**
 * @author jarades
 */
package abstra;

public abstract class Funcionario {

	protected String nome;
	protected int matricula;

	public Funcionario() {

	}

	/*
	 * Overload
	 */
	public Funcionario(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public abstract void exibeDados();

	public void alteraNome(String nome) {
		this.nome = nome;
	}

	public void alteraMatricula(int matricula) {
		this.matricula = matricula;
	}

}
