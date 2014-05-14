package numeroprimo;
import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		int num, sair=1;
		Scanner scan = new Scanner(System.in);
			
		Primo numero = new Primo();
		
		while(sair!=0)
		{
			System.out.println("Digite um numero: ");		
			num = scan.nextInt();
			
			numero.verifica(num);
			System.out.println("Se deseja para, digite 0: ");
			sair = scan.nextInt();
		}
		
		numero.imprimir();
	}

}
