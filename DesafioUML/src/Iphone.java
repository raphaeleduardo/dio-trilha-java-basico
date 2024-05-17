

import java.util.concurrent.ThreadLocalRandom;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	private int versao;
	private String modelo;
	private String cor;
	private int capacidade;

	public Iphone() {
	}

	public Iphone(int versao, String modelo, String cor, int capacidade) {
		this.versao = versao;
		this.modelo = modelo;
		this.cor = cor;
		this.capacidade = capacidade;
	}

	public int getVersao() {
		return versao;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		return "Iphone " + getVersao() + " " + getModelo() + " " + getCor() + " " + getCapacidade() + "GB";
	}

	@Override
	public void tocar() {
		System.out.println("Reprodução iniciada ▶️🎵...");
	}

	@Override
	public void pausar() {
		System.out.println("Reprodução interrompida ⏸️...");
	}

	@Override
	public void selecionarMusica(String nome) {
		System.out.println("Música '" + nome + "' em reprodução 🔊");
	}

	@Override
	public void exibirPagina(String site) {
		System.out.println("Exbindo a página do " + site);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada...");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando 🔄️...");
		try {
			Thread.sleep(3000);
			System.out.println("Página atualizada com sucesso 🆗!");
		} catch (InterruptedException e) {
			System.out.println("Falaha ao atualizar, tente novamente!");
		}
	}

	@Override
	public void ligar(String nome) {
		System.out.println("Ligando para " + nome + " 📞");
	}

	@Override
	public void atender() {
		System.out.println("Chamada atendida ☎️");
	}

	@Override
	public void iniciarCorreioVoz() {
		int correioVoz = ThreadLocalRandom.current().nextInt(0, 10);
		System.out.println("Voce possui " + correioVoz + " mensagens pendentes no Correio de Voz...");
	}

}
