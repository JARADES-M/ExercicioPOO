/**
 * @author jarades
 */
package abstra;

public class Professor extends Funcionario {
	String titulacao;

	public Professor(String nome, int matricula, String titulação) {
		super(nome, matricula);
		this.titulacao = titulação;
	}

	public void exibeDados() {
		String dados;

		dados = "Nome: " + this.nome + "\nMatricula: " + this.matricula
				+ "\nTitulação: " + this.titulacao;

		System.out.println(dados);
	}

	public void alteraTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	/**
	 * @override
	 */
	public void alteraMatricula(int matricula) {
		this.matricula = matricula + 1000;
	}
}
