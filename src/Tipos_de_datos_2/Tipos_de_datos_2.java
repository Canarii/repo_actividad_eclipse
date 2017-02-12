package Tipos_de_datos_2;

import java.util.Scanner;

public class Tipos_de_datos_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub, 
		
		int A = 0, B = 0, C = 0, X = 0;
		int visitas = 0, select;
		double porcentA, porcentB, porcentC, porcentX;
		
		
		Scanner sc=new Scanner(System.in);
		
		
		do {
			
		System.out.println("Introduce el tipo de casa\n Tipo A\n Tipo B\n Tipo C\n Sin Tipo X");
	
		select=sc.next().charAt(0);
		
		switch(select){
			
		case 'A':
			A++;
			visitas++;
			break;
			
		case 'B':
			B++;
			visitas++;
			break;
		case 'C':
			C++;
			visitas++;
			break;
			
		case 'X':
			X++;
			visitas++;
			break;
		
		case '*':
			
			System.out.println("El n�mero de casas Tipo A es: " + A);
			System.out.println("El n�mero de casas Tipo B es: " + B);
			System.out.println("El n�mero de casas Tipo C es: " + C);
			System.out.println("El n�mero de casas sin Tipo es: " + X);
			System.out.println("Y el n�mero de visitas totales son: " + visitas);
			
			//porcentajes
			
			porcentA= (A*100)/visitas;
			porcentB= (B*100)/visitas;
			porcentC= (C*100)/visitas;
			porcentX= (X*100)/visitas;
			
			System.out.println("El porcentaje de casas Tipo A visitadas es: " + porcentA);
			System.out.println("El porcentaje de casas Tipo B visitadas es: " + porcentB);
			System.out.println("El porcentaje de casas Tipo C visitadas es: " + porcentC);
			System.out.println("El porcentaje de casas sin Tipo visitadas es: " + porcentX);
			
			
		
		}
		
		}while (select!=42 );
		
		
		
		
		sc.close();
		

	}

}
