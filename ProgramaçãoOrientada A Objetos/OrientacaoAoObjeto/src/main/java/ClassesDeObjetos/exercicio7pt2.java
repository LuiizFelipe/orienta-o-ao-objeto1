/*
 * Crie uma classe paciente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */

 */
package ClassesDeObjetos;

public class exercicio7pt2 { 
	public static void main(String[] args) {
		Variados paciente =  new Variados();
		
		
		paciente.cpf ="772.255.356.22";
		paciente.nome ="Jo�o De Sousa";
		paciente.rg="27,325,265-25";
		paciente.idade=47;
		
		
		paciente.informarcpf();
		paciente.informarnome();
		paciente.informarrg();
		paciente.informaridade();
}
}