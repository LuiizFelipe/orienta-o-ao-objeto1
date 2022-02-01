/*
 * 6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.
 */
package ClassesDeObjetos;

public class exercicio6pt2 {
	String agencia;//agencia
	float conta;//conta
	int tipo;//tipo
	public exercicio6pt2 (String agencia,String tipo,float conta)
	{
		this.agencia=agencia;
		this.conta=conta;
	}
		
		public void MostrarInformacao() 
		{
			System.out.println("_______________________________");
			System.out.println("conta: "+conta);
			System.out.println("tipo: "+tipo);			
				
	}
	
	
	
}

