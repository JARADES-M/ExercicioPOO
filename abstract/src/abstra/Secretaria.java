/**
 * @author jarades
 */
package abstra;

public class Secretaria extends Funcionario {
	String setor;

	public Secretaria(String nome, int matricula, String setor) {
		super(nome, matricula);
		this.setor = setor;
	}

	public void exibeDados() {
		String dados;

		dados = "Nome: " + this.nome + "\nMatricula: " + this.matricula
				+ "\nSetor: " + this.setor;

		System.out.println(dados);
	}

	public void alteraSetor(String setor) {
		this.setor = setor;
	}

	/**
	 * @override
	 */
	public void alteraMatricula(int matricula) {
		this.matricula = matricula + 2000;
	}

}
