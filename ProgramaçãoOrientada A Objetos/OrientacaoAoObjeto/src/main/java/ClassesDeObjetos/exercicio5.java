/*
 * Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package ClassesDeObjetos;

public class exercicio5 {
	String marca,cor;
	float peso;
	int qualidade;
	public exercicio5(String marca,String cor,float peso)
	{
		this.marca=marca;
		this.cor=cor;
		this.peso=peso;
	}
		
		public void MostrarInformacao() 
		{
			System.out.println("_______________________________");
			System.out.println("Marca: "+marca);
			System.out.println("Cor: "+cor);			
				
	}
	
	
	
}
