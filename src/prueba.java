import java.util.Scanner;

public class prueba 
{
	
	public static void main(String[] args) 
	{
		Scanner in =new Scanner (System.in);
		
		int n;
		int o;
		long x = 0;
		// TODO Auto-generated method stub
		
		System.out.println("bienvenido a calculo de series de taylor");
		System.out.println("escriba un numero");
		
		n = in.nextInt();
		System.out.println("ahora digite la opcion que desea realizar");
		System.out.println("si quiere factorial presione 1");
		System.out.println("siq uiere seno presione 2");
		System.out.println("si quiere potencia presione 3");
		o = in.nextInt();
		
		if (o == 1)
		{
			x = factorial.factorial(n);
			System.out.println("Factorial: " + x);

		}
		if (o == 2)
		{
			
		}
		if ( o == 3)
		{
			
		}
		
		
		
		

	}


}
