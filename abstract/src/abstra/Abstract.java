/**
 * @author jarades
 */
package abstra;

public class Abstract {

	public static void main(String[] args) {
		Professor pro = new Professor("Jão", 2345, "Mestre");
		Secretaria sec = new Secretaria("Maria", 5432, "Diretoria");

		pro.exibeDados();
		sec.exibeDados();

		pro.alteraTitulacao("Doutor");
		pro.alteraNome("João");

		sec.alteraMatricula(4321);
		sec.alteraSetor("Tesouraria");

		pro.exibeDados();
		sec.exibeDados();
	}

}
