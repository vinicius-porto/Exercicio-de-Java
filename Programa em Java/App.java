import java.util.Scanner;
//import java.util.*;

public class App {
	public static void main (String args[]){
		Scanner leitor = new Scanner(System.in);
		//variables
		int idade;
		String nome;
		String endereco;
		double salario;
		//reading
		System.out.printf("Informe a sua idade:");
		idade = leitor.nextInt();
		leitor.nextLine(); 
		
		System.out.printf("Informe o seu nome:");
		nome = leitor.nextLine();
		
		System.out.printf("Informe o seu endereco:");
		endereco = leitor.next();
		leitor.nextLine();
		
		System.out.printf("Informe o seu salario:");
		salario = leitor.nextDouble();
		
		System.out.printf("Dados lidos: %s tem %d anos, ganha %.2f, e mora em %s.\n",nome,idade,salario,endereco);
		//create new object
		Atleta a = new Atleta(nome,idade);
		System.out.printf("Dados do Atleta: %s tem %d anos.\n",a.getNome(),a.getIdade());
	}
}