package br.com.htcursos;

public abstract class ControleRemoto {
	private ControleImbutido controleImbutido;

	public void ligar() {
		controleImbutido.ligar();
	}

	public void deligar() {
		controleImbutido.desligar();
	}

	public void trocarParaOCanal(int canal) {
		controleImbutido.trocarParaOCanal(canal);
	}
}
