package calculo;
import java.util.Scanner;

public class CalculoMatematico
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int enter = 1, num;
		String escolha = "S";
				
		while(escolha == "S")
		{
			System.out.print("Digite um numero inteiro: ");
			num = scan.nextInt();
			
			Matematica valor = new Matematica(num);
			
			while(enter!=0)
			{
				System.out.println("\nEscolha uma das opçoes:\n"
						+ "1. Exponencial\n"
						+ "2. Fatorial\n"
						+ "0. Se deseja sair\n");
				enter = scan.nextInt();
				
				switch(enter)
				{
					case 1:					
						System.out.print("Digite seu exponencial: ");
						num = scan.nextInt();
						valor.setExponencial(num);
						num = valor.getNum();
						System.out.println("\nO exponencial de " + valor.getNum() + " é " + valor.expo());
						break;
						
					case 2:
						System.out.println("\nO fatorial de " + num + " é " + valor.fat(num));
						break;
						
					case 0:
						break;
						
					default:
						System.out.println("Opçao invalida, digite novamente\n");
				}					
			}
			System.out.print("\nDeseja efetuar outro calculo S ou N: ");
			escolha = scan.next();
		}
		
		System.out.print("\nGoodBye :)");

	}

}
