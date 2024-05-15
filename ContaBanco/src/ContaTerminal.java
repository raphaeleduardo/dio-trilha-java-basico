import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		/* TODO: 
		 * 		- Conhecer e importar a classe Scanner
		 *		- Exibir as mensagens para o nosso usuário
		 *		- Obter pela Scanner os valores digitados
		 *		- Exibir a mensagem conta criada
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, digite o número da sua Conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Agora insira o número da Agência: ");
		String agencia = sc.next();
		sc.nextLine();
		
		System.out.print("Digite seu nome por favor: ");
		String nomeCliente = sc.nextLine();
		
		System.out.print("Insira o seu saldo atual: ");
		double saldo = sc.nextDouble();
		
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
		
		sc.close();
	}

}
