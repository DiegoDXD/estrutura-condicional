// Estrutura condional simples
//public class Main {

//	public static void main(String[] args) {
		
//		int x = 5;
		
//		System.out.println("Bom dia");
		
//		if (x < 0) { 
//			System.out.println("Boa tarde");
//		}
//		System.out.println("Boa noite");
//	}
	
//}

//Estrutura condicional composta
//import java.util.Scanner;
//public class Main {

//	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int hora;
		
//		System.out.println("Quantas horas?");
//		hora = sc.nextInt();
		
//		if (hora < 12) {
//			System.out.println("Bom dia");
//		}
//		else {
//			System.out.println("Boa tarde");
//		}
//		sc.close();
//	}
	
//}

//Estrutura condional com mais de um comando
//import java.util.Scanner;
//public class Main {

//	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int hora;
		
//		System.out.println("Quantas horas?");
//		hora = sc.nextInt();
		
//		if (hora < 12) {
//			System.out.println("Bom dia");
//		}
//		else {
//			if (hora < 18) {
//				System.out.println("Boa tarde");
//			}
//			else {
//				System.out.println("Boa noite");
//			}			
//		}
//		sc.close();
//	}
	
//}

//Estrutura condional encadeada com macete
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia");
		}
		else if (hora < 18) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
		}			
		
		sc.close();
	}
	
}
