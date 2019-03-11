package seuNome;

import java.util.ArrayList;

public class PlayList {
	private ArrayList<Musica> musicas;
	private String nome;
	
	public PlayList(String nome) {
		this.nome = nome;
	}
	public ArrayList<Musica> getMusicas() {
		return musicas;
	}
	
	public void adicionarMusica(Musica musica) {
		musicas.add(musica);
	}
	
	public String getNome() {
		return nome;
	}
}
