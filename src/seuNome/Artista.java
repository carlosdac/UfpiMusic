package seuNome;

import java.util.ArrayList;

public class Artista extends Pessoa{
	private ArrayList<Musica> musicas;
	
	public Artista(String nome, int cpf) {
		super(nome,cpf);
	}
	
	public void adicionarMusica(Musica musica) {
		musicas.add(musica);
	}

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}
	
}
