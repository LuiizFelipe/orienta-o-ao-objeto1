package ClassesDeObjetos;

public class  exemplo2 {
		String marca,cor;
		float peso;
		int quantidade;
		private String altura;
		
		public exemplo2 (String marca,String cor,float peso,int quantidade)
		{
			this.marca=marca;
			this.cor=cor;
			this.peso=peso;
			this.quantidade=quantidade;
		}
		
		public void mostrarinformacao() 
		{
			System.out.println("_______________________________");
			System.out.println("Marca: "+marca);
			System.out.println("Cor: "+cor);
			System.out.println("altura: "+altura+"kg");
			System.out.println("Quantidade de pessoas: "+quantidade);
		}
		
}