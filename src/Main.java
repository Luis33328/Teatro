import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> lugares = new ArrayList<String>();
		
		for(int i = 1; i<101; i++) {
			lugares.add(Integer.toString(i));
		}
		
		Scanner sc = new Scanner(System.in);
		
		int option;
		
		//System.out.println(lugares);
		
		while(true) {
			menu();
			
			option = sc.nextInt();
			
			if(option > 0 && option < 7) {
				switch(option) {
					case 1:
						String nome;
						int lugar;
						int idade;
						
						System.out.println("Digite seu nome: ");
						nome = sc.next();
						
						System.out.println("Digite sua idade: ");
						idade = sc.nextInt();
						
						System.out.println("Digite o lugar que deseja ocupar: ");
						lugar =  sc.nextInt();
						
						lugares.set(lugar - 1, nome + "(" + idade + ")");
						System.out.println(lugares);
					break;
					
					case 2:
						String checkName;
						
						System.out.println("Digite seu nome: ");
						checkName = sc.next();
						
						
						for(int i = 0; i<lugares.size(); i++) {
							if(lugares.get(i).contains(checkName.toLowerCase())) {
								lugares.set(i , Integer.toString(i + 1));
							}
						}
					break;
					
					case 3:
						ArrayList<String> vazios = new ArrayList<String>();
						
						for(int i = 0; i<lugares.size(); i++) {
							if(Integer.toString(i + 1).equals(lugares.get(i))) {
								vazios.add(lugares.get(i));
							}
						}
						
						System.out.println("Lugares vazios: ");
						System.out.println(vazios);
					break;
					
					case 4:
						ArrayList<String> ocupados = new ArrayList<String>();
						
						for(int i = 0; i<lugares.size(); i++) {
							if(!Integer.toString(i + 1).equals(lugares.get(i))) {
								ocupados.add(Integer.toString(i + 1));
							}
						}
						
						System.out.println("Lugares ocupados: ");
						System.out.println(ocupados);
					break;
					
					case 5:
						for(int i = 0; i<lugares.size(); i++) {
							if(!Integer.toString(i + 1).equals(lugares.get(i))) {
								System.out.println(lugares.get(i) + ": " + "Lugar " + Integer.toString(i + 1));
							}
						}
					break;
					
					case 6:
						System.out.println("\nPrograma Encerrado.");
						System.exit(1);
					break;
				}
			}
			else {
				System.out.println("Opção inválida.");
			}
			
		}
		
	}
	
	
	public static void menu() {
		System.out.println("---Menu---");
		System.out.println("1- Ocupar lugar");
		System.out.println("2- Desocupar lugar");
		System.out.println("3- Exibir lugares vazios");
		System.out.println("4- Exibir lugares ocupados");
		System.out.println("5- Lugares ocupados por pessoa");
		System.out.println("6- Encerrar programa");
	}
}
