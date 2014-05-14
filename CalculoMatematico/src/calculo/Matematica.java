package calculo;
import java.lang.Math;

public class Matematica
{
	private int exponencial;
	private int num;
	
	Matematica(int pnum)
	{
		this.num = pnum;
	}
	
	public void setExponencial(int valor)
	{
		this.exponencial = valor;
	}
	
	public int getNum()
	{
		return this.num;
	}
	
	public int getExponencial()
	{
		return this.exponencial;
	}
	
	public int getFatorial()
	{
		return this.exponencial;
	}
	
	public double expo()
	{		
		return Math.pow(this.num,this.exponencial);
	}
	
	public int fat(int fatorial)
	{
		if(fatorial==0 || fatorial==1)
			return 1;
		else
		    fatorial = fatorial * fat(fatorial-1);
		return fatorial;
	}
}
