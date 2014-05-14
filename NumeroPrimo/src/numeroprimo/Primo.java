package numeroprimo;

public class Primo {
	
	private int[] vetor = new int[20];
	private int pos = 0;
		
	public boolean verifica(int valor)
	{
		if(valor > 1 && valor!=2 && valor!=3 && valor!=5 && valor!=7 && valor!=11)
		{
			if(valor%2==0 || valor%3==0 || valor%5==0 || valor%7==0 || valor%11==0)
				System.out.println("O " + valor + " não é primo");
			else
			{
				System.out.println("O " + valor + " é primo");
				if(pos<20)
				{
					this.vetor[pos] = valor;
					pos++;
				}
				return true;
			}
		}
		else
		{
			if(valor==0 || valor==1) System.out.println("O " + valor + " não é primo");
		
			else System.out.println("O " + valor + " é primo");
		}
		
		return false;
	}
	
	public void imprimir()
	{
		for(int i=0; i<pos; i++)
		{
			System.out.println(i+1 + " º numero primo: " + vetor[i]);
		}
	}

}
