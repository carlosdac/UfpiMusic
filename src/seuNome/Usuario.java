package seuNome;

public class Usuario extends Pessoa {
	private Biblioteca biblioteca;
	
	public Usuario(String nome, int cpf) {
		super(nome,cpf);
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

}
