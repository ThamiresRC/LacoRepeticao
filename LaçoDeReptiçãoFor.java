package PacoteJava;

import java.util.Scanner;

public class LaçoDeReptiçãoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1; 
		int par=0;
		int impar=0;
		
		Scanner leia = new Scanner (System.in);
		
		
		for(int i=1; i<=10;i++) {
			System.out.println("Digite o numero");
			
			n1 = leia.nextInt();
			
			if (n1 % 2 == 0) {
				par++;
				
				
			} else {
				impar++;
				
			}
			
			
		}
		System.out.println("Os numeros pares são" +par );
		System.out.println("Os numeros imares são" +impar );
		
		
				
			
			
			
			
	


	}

}
