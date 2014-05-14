package imprimeinteiros;

public class ImprimeInteiros {

	public static void main(String[] args) {
		
		int cont=1;
		
		while(cont<=20)
		{
			if(cont%5!=0)
			{
				System.out.print(cont);
				System.out.print('\t');				
			}
			
			else System.out.println(cont);
			
			cont++;
		}
		
		System.out.println("\n");
		
		for(int i=1; i<21; i++)
		{
			if(i%5!=0)
			{
				System.out.print(i);
				System.out.print('\t');				
			}
			
			else System.out.println(i);		
		}

	}

}
