
package ClassesDeObjetos;
import java.util.Scanner;

public class Variados{
	
	String nome;
	int idade;
	String rg;
	String cpf;
		
	public void informarcpf()
	{
		if(this.cpf.length()==14)
			System.out.println("cpf: "+this.cpf);
		else
			System.out.println("Digite o CPF correspondente ");
	}
	
	public void informaridade()
	{
		System.out.println("Idade: "+this.idade);
	}
	
	public void informarnome()
	{
		System.out.println("Idade: "+this.nome);
	}
	
	public void informarrg()
	{
		if(this.rg.length()==7)
			System.out.println("cpf: "+this.rg);
		else
			System.out.println("Digite o Resgitro Geral correspondente ");
	}
}


