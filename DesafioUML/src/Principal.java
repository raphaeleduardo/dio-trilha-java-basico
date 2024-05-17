import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Iphone iphone15 = new Iphone();
		
		System.out.println("Digite a Versão do seu Iphone: ");
		int versao = sc.nextInt();
		
		System.out.println("Digite o Modelo do seu Iphone: ");
		String modelo = sc.next();
		sc.nextLine();
		
		System.out.println("Digite a Cor do seu Iphone: ");
		String cor = sc.nextLine();
		
		System.out.println("Digite a Capacidade de Armazenamento do seu Iphone: ");
		int capacidade = sc.nextInt();
		
		iphone15.setVersao(versao);
		iphone15.setModelo(modelo);
		iphone15.setCor(cor);
		iphone15.setCapacidade(capacidade);
		
		System.out.println(iphone15.toString());
		System.out.println();
		
		// Aparelho Telefônico
		iphone15.ligar("Raphael");
		iphone15.atender();
		iphone15.iniciarCorreioVoz();
		System.out.println();
		
		// Reprodutor Musical
		iphone15.tocar();
		iphone15.pausar();
		iphone15.selecionarMusica("November Rain - Guns N' Roses");
		System.out.println();
		
		// Navegador na Internet
		iphone15.exibirPagina("Facebook");
		iphone15.adicionarNovaAba();;
		iphone15.atualizarPagina();

		sc.close();
	}
}
