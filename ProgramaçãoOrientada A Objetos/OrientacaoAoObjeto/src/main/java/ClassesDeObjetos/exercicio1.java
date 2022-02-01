/*
 * Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package ClassesDeObjetos;

public class exercicio1 {
	public static void main(String[] args) {
		Variados cliente =  new Variados();
		
		
		cliente.cpf ="029.182.092-22";
		cliente.nome ="Maria Dos Campos";
		cliente.rg="31.008.268-3";
		cliente.idade=52;
		
		
		cliente.informarcpf();
		cliente.informarnome();
		cliente.informarrg();
		cliente.informaridade();
}
}