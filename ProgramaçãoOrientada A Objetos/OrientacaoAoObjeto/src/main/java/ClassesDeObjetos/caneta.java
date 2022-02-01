/*
 para definir um objeto deve conter: 
 caracteristicas = atributos.
 comportamento = metodos (a��es , fun�oes do seu objeto).
 estado = como o objeto esta, situa��o em que se encontra.
 this -> faz referencias a atributos dentro da mesma classe.
 */

package  ClassesDeObjetos;

public class caneta {
	//ATRIBUTOS (variaveis do seu objeto onde ira fazer as defini�oes).
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	//METODOS (executa uma a��o do seu objeto).
	
	public caneta(int valor) // -> metodo construtor. (dentro do parenteses ser�o criadas variaves)
	{
		//definindo como padr�o a caneta com tampa fechada.
		this.tampada = true;
		
		//definindo o atributo carga = valor(variavel criada no construtor).
		this.carga=valor;
	}
	
	public void tampar()
	{
		this.tampada=true;
	}
	
	public void destampar()
	{
		this.tampada=false;
	}
	
	public void escrever()
	{
		if(this.tampada==tampada)
			System.out.println("ERRO! Caneta Esta Tampada");
		else
			System.out.println("Escrevendo...");
	}
	
	public void status()
	{
		System.out.println("A cor da caneta : "+this.cor);
		System.out.println("A ponta �: "+this.ponta);
		System.out.println("Esta tampada "+this.tampada);
		System.out.println("Carga: "+this.carga+"%");
	}

}